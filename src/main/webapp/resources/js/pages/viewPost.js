function ViewArticleCtrl($scope, $http) {
	$scope.articleList = [];
	$scope.tagList = [];
	$http.get(_context + '/viewPost/json').then(function(response) {
		$scope.articleList = response.data.articleList;
		$scope.tagList = response.data.tagList;
	});

}