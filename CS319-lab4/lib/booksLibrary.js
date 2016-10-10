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

    var l = new Library();

    if (window.localStorage.getItem("shelfs") === null) {
        console.log("no lib yet");
        var mytable = $("<table border='2'></table>"); // creates DOM elements
        var mytablebody = $('<tbody></tbody>');
        var curr_row = $('<tr></tr>');
        for (i = 0; i < 4; i++) {
            var curr_cell = $('<td width="80"></td>');
            curr_cell.append(l.shelfs[i].name);
            curr_row.append(curr_cell);
        }
        mytablebody.append(curr_row);
        mytable.append(mytablebody);
        mytable.insertAfter($('#lib'));
    } else {
        //TODO
    }
}

function Shelf(name) {
    this.name = name;
    this.books = new Array();
}

function Book(id, isR, studentName, isAvailable) {
    this.bookID = id;
    this.isReference = isR;
    this.brrowedBy = studentName;
    this.presence = isAvailable;
}
