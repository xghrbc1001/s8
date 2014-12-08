function SignUpCtrl($scope, $http) {
	$scope.user = {};
	$scope.isFrmValid = false;
	$scope.alerts = [];

	$scope.doSignUp = function() {
		$http
				.post(_context + '/signUp', $scope.user)
				.then(
						function(resp) {
							if (resp.data.success) {
								$scope.alerts
										.push({
											type : 'success',
											title : 'Heads up!',
											content : ' You are now member of Online Bookmark family.Your password has been sent to your email id.'
										});

							} else {
								$scope.alerts
										.push({
											type : 'error',
											title : 'Sorry!',
											content : ' There are some problem while saving your information.'
										});
							}
							console.log($scope.alerts);
						});
	};

}