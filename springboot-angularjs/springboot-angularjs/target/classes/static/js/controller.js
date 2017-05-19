'use strict';
var app = angular.module("loginApp",[]);
app.controller("loginController",function($scope,$http,$log){
	
	$log.log("####################");
	
	var url = "http://localhost:6510/hello1/";
	var self = this;
	self.user = {name:'',password:''};
	self.submit = submit;
	
	self.logs = {name:'', password:''};
	self.login = login;
	self.logins = []
	
	function login(){
		$log.log("llllllllllllllllllllllllllllll");
		$log.log(self.logs.name+ "and " +self.logs.password);
		
		$http({
				url : url,
				method : "GET",
				data : self.logins
		})
		.then(function(response){
			self.logins = response.data;
				return Http;
		})
		.then(function(errResponse){
			alert("error")
		});
		
	};
	
	function submit(){
	$log.log("llllllllllllllllllllllllllllll");
	$log.log(self.user.name+ "and " +self.user.password);
	$log.log("llllllllllllllllllllllllllllll");
	
		$http.post(url,self.user)
		.then(function(res){
			console.log("***************************");
			window.location.href = "http://localhost:6510/dashboard.html";
		});
	}
	
	
	
});

	