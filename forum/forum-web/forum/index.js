var mainWarp = angular.module('mainWrap',['ngRoute']);
mainWarp
.controller('signController', function ($scope, $route) { $scope.$route = $route;})
.config(function($routeProvider){
    $routeProvider
    .when('/signIn',{
        templateUrl: '../sign/sign-in.html',
        controller:'signController'
    })
});