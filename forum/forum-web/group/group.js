var groupApp = angular.module('groupApp', []);
groupApp.service('groupService', function ($http) {
    var service = {
        getGroupTopics: function () {
            return $http.get('http://127.0.0.1:8081/forum/item/itemTitles', {cache: true}).then(function (response) {
                return response.data;
            });
        }
    }

    return service;
});
