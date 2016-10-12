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
}

Library.prototype.createTable = function () {

        l = new Library();
        var rowIndex = 0;
        var colIndex = 0;

        if (window.localStorage.getItem("shelfs") === null) {
            console.log("no lib yet");
            var mytable = $("<table id='table' border='2'></table>"); // creates DOM elements
            var mytablebody = $('<tbody></tbody>');
            var curr_row = $('<tr></tr>');
            for (var i = 0; i < 4; i++) {
                var curr_cell = $('<th width="80" height="18"></th>');
                curr_cell.append(l.shelfs[i].name);
                curr_row.append(curr_cell);
                mytablebody.append(curr_row);
            }
            for (var j = 0; j < 10; j++) {

                curr_row = $('<tr></tr>');
                for (i = 0; i < 4; i++) {
                    var curr_cell = $('<td class="book" width="80" height="18"></td>');
                    curr_row.append(curr_cell);
                }
                mytablebody.append(curr_row);
            }
            mytable.append(mytablebody);
            mytable.insertAfter($('#lib'));


        } else {
            //TODO
        }

        $("#table td").click(function () {
            rowIndex = $(this).parent().index('tr');
            colIndex = this.cellIndex;
            var value = $(this).html();
            console.log("Index R: " + rowIndex + " C: " + colIndex + " Value: " + value);


            if (value === "" && /^username=admin/.test(document.cookie)) {
                console.log("Add book here");
                $("#form").show();
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

            if (parseInt(id) % 4 === 0) {
                l.shelfs[0].books.push(newBook);
            } else if (parseInt(id) % 4 === 1) {
                l.shelfs[1].books.push(newBook);
            } else if (parseInt(id) % 4 === 2) {
                l.shelfs[2].books.push(newBook);
            } else if (parseInt(id) % 4 === 3) {
                l.shelfs[3].books.push(newBook);
            }
            console.log("add to R: " + rowIndex + " C: " + colIndex);
            document.getElementById("table").children[0].children[rowIndex].children[colIndex].innerHTML += newBook.bookName;
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