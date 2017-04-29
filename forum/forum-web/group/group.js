var groupApp = angular.module("groupApp", []);
groupApp.controller('groupAppLoad', function ($scope, $http) {
    $http.get("localhost:8081/forum/item/itemTitles").then(function (response) {
        alert(response);
    })
});