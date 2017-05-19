'use strict';

var app = angular.module("loginApp",[]);


app.controller("loginController",['$scope','logService','$log','$http',function($scope,logService,$log,$http){

	$log.log("####################");
	var url = "http://localhost:6510/hello1/";
	var self = this;
	self.user = {name:'',password:''};
	/*self.submit = submit;*/
	self.donors = [];
	self.logs = {name:'', password:''};
	self.suggested=null;
/*	self.login = login;*/
	
	/*self.logins = [];*/
	
	
	self.fetchDonors = function(){
		logService.fetchDonors()
		.then(
				function(donorsResponse){
					self.user = donorsResponse;
					$log.log(self.user);
				},
				function(errorResponse){
					$log.error('Error while fetching donors');
				}
		);
	}
	
	self.createDonor = function(){
		$http.post(url,self.user)
		.then(function(res){
			console.log("***************************");
			window.location.href = "http://localhost:6510/dashboard.html";
		},function(errResponse){
			$log.error('Error while cvreating');
		}
		
		);
	}
	
}]);

/*app.factory('logService',['$http','$q',function($http,$q){
	
	return {
		fetchDonors : function(){
			return $http.get(url)
			.then(function(fetchResponse){
				return fetchResponse.data;
				
			},function(errResponse){
				console.error('Error while fetching Donors');
				return $q.reject(errResponse);
			}
			);
		},
		createDonors : function(){
			return $http.post(url,user)
			.then(
				function(createResponse){
					console.error('User created successfully'+response.data);
					return response.data;
					
				},function(errResponse){
					console.error('Error while creating user');
					return $q.reject(errResponse);
				}	
			);
		}
	};
	
}]);*/