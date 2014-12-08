function SignInCtrl($scope, $http) {
	$scope.user = {};
	$scope.isFrmValid = false;
	$scope.alerts = [];

	$scope.submit = function() {
		$http.post(_context + '/signIn', $scope.user).then(function(response) {
			if (response.data.success) {
				if (response.data.isFirstLogin) {
					window.location = _context + '/index';
				} else {
					window.location = _context + '/changePassword';
				}
			} else {
				$scope.alerts = [];
				$scope.alerts.push({
					type : 'error',
					title : 'Sorry!',
					content : ' Username and Password are incorrect.'
				});
			}
		});
	};
}