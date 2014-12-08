function AddArticleCtrl($scope, $http) {
	$scope.title = '';
	$scope.problem = '';
	$scope.solution = '';
	$scope.tags = '';
	$scope.articleList = [];

	$scope.saveArticle = function() {
		$http({
			method : 'POST',
			url : _context + '/addPost/save',
			data : {
				title : $scope.title,
				problem : $scope.problem,
				solution : $scope.solution
			}
		}).then(function(response) {
			$scope.articleList = response.data.articleList;
		});
	};

}