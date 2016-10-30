$(document).ready(function () {
    l = new Library();
});

function Library() {
    this.shelfs = new Array();
    var s1 = new Shelf("Art", 0, new Array());
    var s2 = new Shelf("Science", 1, new Array());
    var s3 = new Shelf("Sport", 2, new Array());
    var s4 = new Shelf("Literature", 3, new Array());
    var shelfs = this.shelfs;


    //TODO: query shelves from database.
    $.post("query.php", {
        op: "shelfs"
    }, function (data, status) {

        var json_obj = JSON.parse(data);

        s1 = new Shelf("Art", 0, json_obj[0]);
        s2 = new Shelf("Science", 1, json_obj[1]);
        s3 = new Shelf("Sport", 2, json_obj[2]);
        s4 = new Shelf("Literature", 3, json_obj[3]);

        shelfs.push(s1);
        shelfs.push(s2);
        shelfs.push(s3);
        shelfs.push(s4);

        console.log(shelfs);

        Library.prototype.createTable();

    });

}

Library.prototype.setCSS = function () {
    for (var i = 0; i < 4; i++) {
        for (var j = 0; j < this.shelfs[i].books.length; j++) {
            var r = $("#table tbody")[0].children[j + 1];
            var c = $(r)[0].children[i];
            if (this.shelfs[i].books[j].presence == 1) {
                $(c).css("background-color", "white");
            } else {
                $(c).css("background-color", "red");
            }
        }
    }
}

Library.prototype.createTable = function () {

        var rowIndex = 0;
        var colIndex = 0;
        var book = null;

        var mytable = $("<table id='table' border='2'></table>"); // creates DOM elements
        var mytablebody = $('<tbody></tbody>');
        var curr_row = $('<tr></tr>');
        for (var i = 0; i < 4; i++) {
            var curr_cell = $('<th width="80" height="18"></th>');
            curr_cell.append(l.shelfs[i].name);
            curr_row.append(curr_cell);
            mytablebody.append(curr_row);
        }


        for (var j = 0; j < 20; j++) {

            curr_row = $('<tr></tr>');
            for (i = 0; i < 4; i++) {
                var curr_cell = $('<td class="book" width="80" height="18"></td>');
                if (l.shelfs[i].books[j] != undefined) {
                    curr_cell.append(l.shelfs[i].books[j].bookName);
                }
                curr_row.append(curr_cell);
            }
            mytablebody.append(curr_row);
        }
        mytable.append(mytablebody);
        mytable.insertAfter($('#lib'));

        //TODO: save shelves to data base;

        l.setCSS();

        $("#table td").click(function () {
            $("#borrow").hide();
            $("#return").hide();
            rowIndex = $(this).parent().index('tr');
            colIndex = this.cellIndex;
            var value = $(this).html();
            console.log("Index R: " + rowIndex + " C: " + colIndex + " Value: " + value);


            if (value === "" && admin == 1) {
                console.log("Add book here");
                $("#form").show();
            } else if (value != "") {
                book = l.shelfs[colIndex].books[rowIndex - 1];
                var des = "Book name: " + book.bookName + " Book ID: " + book.bookID + "\nBorrowed By: " + book.brrowedBy + " Present: " + book.presence;
                $("#description").html(des);

                if (admin == 0) {
                    $("#borrow").show();
                    //TODO: return book
                    if (document.cookie.substring(9) == book.brrowedBy) {
                        $("#return").show();
                    }


                }
            }

        });

        //    if (/^username=U/.test(document.cookie)) {
        //        console.log("Undergrad student");
        //    } else if (/^username=admin/.test(document.cookie)) {
        //        console.log("Admin");
        //    }

        $("#form #add").click(function () {
            var name = $("#bookName").val();
            var id = $("#bookID").val();
            var newBook = new Book(name, id, false, null, true);

            l.shelfs[colIndex].books.push(newBook);
            console.log("add to R: " + rowIndex + " C: " + colIndex);
            document.getElementById("table").children[0].children[l.shelfs[colIndex].books.length].children[colIndex].innerHTML += newBook.bookName;
            $("#form").hide();
            $("#bookName").val("");
            $("#bookID").val("");
            var shelfString = JSON.stringify(l.shelfs);
            localStorage.setItem("shelfs", shelfString);
        });

        $("#borrow").click(function () {
            var username = document.cookie.substring(9);
            var userString = localStorage.getItem(username);
            var ret = "failed";
            var user;
            if (userString == undefined) {
                user = new User(username);
            } else {
                user = JSON.parse(userString);
            }

            if (user.brrowCount < 2 && book.presence == 1) {
                user.brrowCount += 1;
                book.brrowedBy = user.name;
                book.presence = 0;
                ret = "Success";
            }

            userString = JSON.stringify(user);
            localStorage.setItem(user.name, userString);

            var shelfString = JSON.stringify(l.shelfs);
            localStorage.setItem("shelfs", shelfString);

            $("#borrow").hide();
            $("#description").html(ret);

            l.setCSS();

        });

        $("#return").click(function () {
            $("#return").hide();
            book.brrowedBy = null;
            book.presence = 1;
            var username = document.cookie.substring(9);
            var userString = localStorage.getItem(username);
            var user = JSON.parse(userString);
            user.brrowCount -= 1;

            userString = JSON.stringify(user);
            localStorage.setItem(user.name, userString);

            var shelfString = JSON.stringify(l.shelfs);
            localStorage.setItem("shelfs", shelfString);

            $("#description").html("Success");

            l.setCSS();
        });

    } // end of createTable

function User(name) {
    this.name = name;
    this.brrowCount = 0;
}

function Shelf(name, id, books) {
    this.id = id;
    this.name = name;
    this.books = books;
    var i;
    for (i = 0; i < books.length; i++) {
        books[i] = new Book(books[i].bookName, books[i].bookID, books[i].author, books[i].presence);
    }
}

function Book(name, id, author, isAvailable) {
    this.bookName = name;
    this.bookID = id;
    this.author = author;
    this.presence = isAvailable;
}
