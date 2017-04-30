var mainWarp = angular.module('mainWrap', ['ui.router']);
mainWarp.controller('groupLoadController', function ($scope, $http) {
    $http.get('http://127.0.0.1:8081/forum/item/itemTopics').then(function (response) {
        $scope.topics = response.data;
    })
});
mainWarp.config(function ($stateProvider) {
    $stateProvider.state('signIn', {
        url: '/login',
        templateUrl: '../sign/sign-in.html'
    });
    $stateProvider.state('group', {
            url: '/group',
            templateUrl: '../group/group.html',
            controller: 'groupLoadController'
        }
    )
});