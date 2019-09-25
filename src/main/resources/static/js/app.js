var app = angular.module("playerManager", []);

app.controller("playerController", function($scope, $http) {

	$scope.players = [];
	$scope.status = [ "PENDING", "COMPLETED" ];
	$scope.playerForm = {
		id : -1,
		taskName : "",
		taskDesc : ""
	};

	$scope.getClass = function(player) {

		if (player.status == 'PENDING')
			return 'red';
		else if (player.status == 'COMPLETED') {
			return 'green';
		}
	}

	_refreshPlayerData();

	function _refreshPlayerData() {

		$http({
			method : 'GET',
			url : 'http://localhost:8082/players/getAllPlayers'
		}).then(function successCallback(response) {
			$scope.players = response.data;

			// alert($scope.players);
		}, function errorCallback(response) {
			console.log(response.statusText);
		});
	}

	$scope.submitPlayer = function() {

		var method = "";
		var url = "";
		if ($scope.playerForm.id == -1) {
			// Id is absent in form data, it is create new player operation
			method = "POST";
			url = '/players/addPlayer';
		} else {
			// Id is present in form data, it is edit player operation
			method = "PUT";
			url = '/players/updatePlayer';
		}

		$http({
			method : method,
			url : url,
			data : angular.toJson($scope.playerForm),
			headers : {
				'Content-Type' : 'application/json'
			}
		}).then(_success, _error);
	};

	$scope.deletePlayer = function(player) {
		$http({
			method : 'DELETE',
			url : '/players/deletePlayer/' + player.id
		}).then(_success, _error);
	};

	$scope.editPlayer = function(player) {

		$scope.playerForm.taskName = player.taskName;
		$scope.playerForm.taskDesc = player.taskDesc;
		$scope.playerForm.status = player.status;
		$scope.playerForm.id = player.id;
	};

	function _success(response) {
		// alert("success");
		_refreshPlayerData();
		_clearFormData();
	}

	function _error(response) {
		// alert("error");
		console.log(response.statusText);
	}

	// Clear the form
	function _clearFormData() {
		$scope.playerForm.id = -1;
		$scope.playerForm.taskName = "";
		$scope.playerForm.taskDesc = "";
		$scope.playerForm.status = "";

	}
	;
});