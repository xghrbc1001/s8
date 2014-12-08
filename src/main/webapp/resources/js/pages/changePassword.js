function ChangePassword($scope, $http) {
	$scope.user = {};
	$scope.isFrmValid = false;
	$scope.alerts = [];

	$scope.submit = function() {
		$http.post(_context + '/changePassword', $scope.user).then(
				function(response) {
					if (response.data.success) {
						window.location = _context + '/signIn';
					} else {
						$scope.alerts.push({
							type : 'error',
							title : 'Sorry!',
							content : response.data.error
						});
					}
				});
	};
}