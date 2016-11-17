angular.module('myApp', ['ngRoute'])
    .config(function ($routeProvider) {
        $routeProvider.when("/", {
            //TODO: controller
            controller: "loginController",
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
    })
    .controller('indexController', function ($scope) {})
    .controller('loginController', function ($scope) {
        $scope.url = "#login";
        $scope.loginFn = function () {
            if ($scope.username == "admin" && $scope.username == $scope.password) {
                $scope.url = "#librarian";
            } else if (/^U/.test($scope.username)) {
                $scope.url = "#student";
            } else {
                $scope.url = "#login";
            }
        }
        $scope.checkLogin = function () {
            if (/^U/.test($scope.username) || $scope.username == "admin" && $scope.username == $scope.password) return;
            alert("Login Failed");
        }
    })
    .controller('libController', function ($scope) {

    });
