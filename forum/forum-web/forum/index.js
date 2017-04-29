var mainWarp = angular.module('mainWrap', ['ngRoute']);
mainWarp
    .controller('signController', function ($scope, $route) {
        $scope.$route = $route;
    }).controller("groupController", function ($scope, $route) {
    $scope.$route = $route;
}).config(function ($routeProvider) {
    $routeProvider
        .when('/signIn', {
            templateUrl: '../sign/sign-in.html?itemTitle=1',
            controller: 'signController'
        })
        .when("/group", {
            templateUrl: '../group/group.html',
            controller: 'groupController'
        })
});