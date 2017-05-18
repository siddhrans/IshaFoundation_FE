'use strict';
angular.module('myApp',[]).factory('donarservice',['$http','$q',function($http,$q){
	var REST_SERVICE_URI='http://localhost:6511/donar1/';
	var	factory ={
			createdonar:createdonar
	};
	return factory;
	function createdonar(donar_info){
		var deffered=$q.defer();
		$http.post(REST_SERVICE_URI,donar_info)
		.then(
		  function(response){
			  deffered.resolve(response.data);
		  },
		  function(errResponse){
			  console.resolve('error while creating user');
			  deferred.reject(errResponse);
		  }
		  );
		return deffered.promise;	
	}
		}]);