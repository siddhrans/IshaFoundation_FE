/**
 * 
 */
'use strict';

app.factory('logService',['$http','$q','$log',function($http,$q,$log){
	return {
		fetchDonors : function(){
			return $http.get("http://localhost:6510/hello1/")
			.then(function(fetchResponse){
				return fetchResponse.data;
				
			},function(errResponse){
				$log.error('Error while fetching Donors');
				return $q.reject(errResponse);
			}
			);
		},
		createDonor : function(){
			return $http.post("http://localhost:6510/hello1/",self.user)
			.then(
				function(createResponse){
					$log.error('User created successfully'+response.data);
					return response.data;
					
				},function(errResponse){
					$log.error('Error while creating user');
					return $q.reject(errResponse);
				}	
			);
		}
	};
	
}]);