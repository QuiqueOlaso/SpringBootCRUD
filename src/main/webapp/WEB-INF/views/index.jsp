<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<link href="/css/app.css" rel="stylesheet" />

<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script type="text/javascript" src="/js/app.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Player Manager</title>
</head>
<body ng-app="playerManager" ng-controller="playerController">
	</br>
	<h4 class="player">Player Manager</h4>

	<form ng-submit="submitPlayer()">
		<table>

			<tr>
				<th colspan="2">Add/Edit player</th>
			</tr>
			<tr>
				<td>Task Name</td>
				<td><input type="text" ng-model="playerForm.taskName" /></td>
			</tr>
			<tr>
				<td>Task Desc</td>
				<td><input type="text" ng-model="playerForm.taskDesc" /></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><select id="status" ng-model="playerForm.status"
					ng-options="x for x in status" /></select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"
					class="blue-button" /></td>
			</tr>
		</table>
	</form>

	<table>
		<tr>

			<th width="120">Task Name</th>
			<th width="120">Task Desc</th>
			<th width="60">Status</th>
			<th width="60">Operations</th>

		</tr>

		<tr ng-repeat="player in players" ng-init="statusCls=getClass(player)">

			<td>{{ player.taskName }}</td>
			<td>{{ player.taskDesc }}</td>
			<td class="statusCls">{{ player.status }}</td>

			<td><a ng-click="editPlayer(player)" class="blue-button">Edit</a>
				| <a ng-click="deletePlayer(player)" class="red-button">Delete</a></td>
		</tr>

	</table>

</body>
</html>