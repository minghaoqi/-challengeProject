var mainWarp = angular.module('mainWrap', ['ui.router']);
mainWarp.controller('groupLoadController', function ($scope, $http) {
    $http.get('http://127.0.0.1:8081/forum/item/topics').then(function (response) {
        $scope.topics = response.data;
    });
});
mainWarp.controller('articleListController', function ($scope, $http, $stateParams) {
    var topicId = $stateParams.itemTopicId;
    $http.get('http://127.0.0.1:8081/forum/item/' + topicId).then(function (response) {
        $scope.topics = response.data;
    });
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
    });
    $stateProvider.state('article-list', {
        url: 'article-list/:itemTopicId',
        templateUrl: '../article-list/article-list.html',
        controller: 'articleListController'
    });
});