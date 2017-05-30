'use strict';
myApp.factory("localService",['$http','$log','$q',function($http,$log,$q){
	
	var factory = {
			register : registration	,
			fetchDonors : fetchDonors,
			createDonor: createDonor,
			update : update
	};
	return factory;
	
	function registration(registerData){
		var deferred = $q.defer();
		$log.log("---Register servivce entered---");
		$http.post('http://localhost:6512/hello1/',registerData)
		.then(function(SuccesResponse){
			$log.log("----Registerd Successfully----");
			deferred.resolve(SuccesResponse.data);
		},
		function(ErrorResponse){
			$log.log("----Error while Registering----");
			deferred.reject(ErrorResponse);
		}
		);
		return deferred.promise;
	};
	
	function fetchDonors(){
		return $http.get("http://localhost:6512/donar1/")
		.then(function(fetchResponse){
			return fetchResponse.data;
			
		},function(errResponse){
			$log.error('Error while fetching Donors');
			return $q.reject(errResponse);
		}
		);
	};
	
	function createDonor(donar_info) {
	     console.log('Creating donor');
	     var deferred = $q.defer();
	     console.log('-------------------creteDonor service--------------');
	  
	     console.log(donar_info);
	     $http.post('http://localhost:6512/donar1/',donar_info)
	         .then(
	             function (response) {
	            	 console.log('response block');
	            	 console.log(donar_info);
	                 deferred.resolve(response.data);
	             },
	             function (errResponse) { 
	                console.error('Error while creating Donor :');
	                deferred.reject(errResponse);
	             }
	         );
	     return deferred.promise;
	 };
	function update(donar_info){
		 var deferred = $q.defer();
		 var Urll = 'http://localhost:6512/donar1/' + donar_info.consumerCode;
		 $log.log(Urll);
		 $http.put(Urll,donar_info)
		 .then(function(response){
			 $log.log("--------sucess---------");
			 var data = response.data;
			 return data;
			/* deferred.resolve();*/
		 },function(errResponse){
			 $log.log("Error while creating Donor ");
			 deferred.reject(errResponse);
			 
		 });
		 return deferred.promise;
	}
	 
	/* function update(DonorsList,ids){
		 var deferred = $q.defer();
		 $log.log("------updateeeee---------");
		 var Urll = 'http://localhost:6512/donar1/' + ids;
		 $log.log(" ----  " + ids + "----- " + Urll) ;
		 $http.put(Urll,DonorsList)
		 .then(function(res){
			 $log.log("-sucess-");
			 var data = res.data;
			 return data;
			 deferred.resolve(res.data);
		 },function(errResponse){
			 console.error('Error while creating Donor :');
             deferred.reject(errResponse);
		 })
		 return deferred.promise;
	 };*/
	  /* function updateDonor(donar_info){
		 var deferred=$q.defer();
		 console.log('-----------------updateDonor service---------------');
		 $http.put('http://localhost:6512/donar1/',donar_info)
		 .then(
				 function(response){
					 console.log('response block');
					 console.log(donar_info);
					 fetchDonors();
					  deferred.resolve(response.data);
					  },
					  function(errResponse) {
						  console.error('Error while updating Donor :'); 
						  deferred.reject(errResponse);
					  }
				 );
		 return deferred.promise;
	 };*/

}]);
