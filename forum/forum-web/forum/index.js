var mainWarp = angular.module('mainWrap', ['ui.router']);
mainWarp.config(function ($stateProvider) {
    $stateProvider.state('signIn', {
        url: '/signIn',
        templateUrl: '../sign/sign-in.html'
    });
    $stateProvider.state('group', {
        url: '/group',
        templateUrl: '../group/group.html',
        component: 'group',
        resolve: {
            group: function (groupService) {
                return groupService.getGroupTopics();
            }

        }
    })
});