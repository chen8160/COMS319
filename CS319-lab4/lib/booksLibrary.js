$(document).ready(function () {
    Library.prototype.createTable();
});

function Library(username) {
    this.shelfs = new Array();
    var s1 = new Shelf("Art");
    var s2 = new Shelf("Science");
    var s3 = new Shelf("Sport");
    var s4 = new Shelf("Literature");

    this.shelfs.push(s1);
    this.shelfs.push(s2);
    this.shelfs.push(s3);
    this.shelfs.push(s4);

    for (var i = 0; i < 25; i++) {
        var id = Math.floor(Math.random() * 1000);
        var b;
        if (i % 5 == 0) {
            var name = "Ref " + (Math.floor(Math.random() * 25) + 1);
            b = new Book(name, id, true, null, true);
        } else {
            var name = "Book " + (Math.floor(Math.random() * 25) + 1);
            b = new Book(name, id, false, null, true);
        }

        if (id % 4 == 0) {
            this.shelfs[0].books.push(b);
        } else if (id % 4 == 1) {
            this.shelfs[1].books.push(b);
        } else if (id % 4 == 2) {
            this.shelfs[2].books.push(b);
        } else if (id % 4 == 3) {
            this.shelfs[3].books.push(b);
        }
    }
}


Library.prototype.createTable = function () {

        l = new Library();
        var rowIndex = 0;
        var colIndex = 0;

        var mytable = $("<table id='table' border='2'></table>"); // creates DOM elements
        var mytablebody = $('<tbody></tbody>');
        var curr_row = $('<tr></tr>');
        for (var i = 0; i < 4; i++) {
            var curr_cell = $('<th width="80" height="18"></th>');
            curr_cell.append(l.shelfs[i].name);
            curr_row.append(curr_cell);
            mytablebody.append(curr_row);
        }

        if (window.localStorage.getItem("shelfs") === null) {
            console.log("no lib yet");

            var maxRows = 0;
            for (i = 0; i < 4; i++) {
                if (l.shelfs[i].books.length > maxRows) {
                    maxRows = l.shelfs[i].books.length;
                }
            }

            for (var j = 0; j < maxRows; j++) {

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

            var shelfString = JSON.stringify(l.shelfs);
            localStorage.setItem("shelfs", shelfString);
        } else {
            //TODO
            l.shelfs = JSON.parse(localStorage.getItem("shelfs"));

        }

        $("#table td").click(function () {
            rowIndex = $(this).parent().index('tr');
            colIndex = this.cellIndex;
            var value = $(this).html();
            console.log("Index R: " + rowIndex + " C: " + colIndex + " Value: " + value);


            if (value === "" && /^username=admin/.test(document.cookie)) {
                console.log("Add book here");
                $("#form").show();
            } else if (value != "") {
                var book = l.shelfs[colIndex].books[rowIndex - 1];
                var des = "Book name: " + book.bookName + " Book ID: " + book.bookID + "\nIs Reference: " + book.isReference + " Borrowed By: " + book.brrowedBy + " Present: " + book.presence;
                $("#description").html(des);
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
        });
    } // end of createTable





function Shelf(name) {
    this.name = name;
    this.books = new Array();
}

function Book(name, id, isR, studentName, isAvailable) {
    this.bookName = name;
    this.bookID = id;
    this.isReference = isR;
    this.brrowedBy = studentName;
    this.presence = isAvailable;
}