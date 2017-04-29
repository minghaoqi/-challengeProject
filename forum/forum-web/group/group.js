var groupApp = angular.module("groupApp", []);
groupApp.controller('groupAppLoad', function ($scope, $http) {
    $http.get("http://127.0.0.1:8081/forum/item/itemTitles").then(function (response) {
        $scope.topics = response.data;
    })
});