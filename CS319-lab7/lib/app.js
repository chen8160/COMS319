angular.module('myApp', ['ngRoute']).config(function ($routeProvider) {
    $routeProvider.when("/login", {
        //TODO: controller
        templateUrl: "login.html"
    });
    $routeProvider.when("/student", {
        //TODO: controller
        templateUrl: "student.html"
    });
    $routeProvider.when("/librarian", {
        //TODO: controller
        templateUrl: "librarian.html"
    });
}).controller('indexController', function ($scope) {});
