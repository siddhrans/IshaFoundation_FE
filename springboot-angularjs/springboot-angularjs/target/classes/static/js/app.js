'use strict';
var app = angular.module('loginApp',['ngRoute']);
app.config(function($routeProvider){
	$routeProvider
	.when('/login',{
		templateUrl:'/views/login.html'
				
	})
	.when('/index',{
		templateUrl: '/views/roles.html',	
	});
});

app.controller("loginController",['$scope','$location','$log',function($scope,$location,$log){
	$scope.loginSubmit = function(){
		var username=$scope.username;
		var password=$scope.password;
		$log.log("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		if($scope.username=="sharath" && $scope.password =="sharath"){
			$log.log("navigation pageeeeeeeeeeeee"+$scope.username+" and "+$scope.password);
			window.location.href = "http://localhost:6510/index.html";
			//$loction.path("/index");
		}else{
			alert("no wrong entries ");
		}
	};
}]);
/*var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/users',{
            templateUrl: '/views/users.html',
            controller: 'usersController'
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'rolesController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});*/

