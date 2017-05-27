'use strict';
var myApp = angular.module("loginApp",[]);
myApp.controller("loginController",['$log','$scope','localService','$http',function($log,$scope,localService,$http){
	$log.log("------------Controller-----------");
	
	
	var self = this;
	self.registerData = {registrationFirstName:'',registrationLastName:'',registrationEmail:'',
					registrationMobile:'',registrationPasscode:'',registrationConfirmPasscode:''};
	
	self.donar_info={ consumerCode:'',donorfirstname:"",donorlastname:"",donoremail:"",donormobile:"",donorAddress:"",
			donorRegion:"",donorCity:"",donorState:"",donorCenter:"",
			bankDetailsAccountHolderName:"",bankDetailsBankName:'',bankDetailsBranchName:"",bankDetailsAccountNo:"",
			bankDetailsIFSCCode:"",micr:"",bankDetailsAccountType:"",
			paymentDetailsStartDate:"",paymentDetailsEndDate:"",paymentDetailsAmountInRs:"",
			paymentDetailsFrequency:"",comments:"",createdonorstatus:''};
	
	
	
	self.registerd = [];
	self.SuccessMessage='';
	self.ErrorMessage='';
	self.DonorsList = [];
	self.successMessage = '';
    self.errorMessage = '';
	self.onlyNumbers = /^\d+([,.]\d+)?$/;
	
	var url='http://localhost:6512/donar1/';
	self.edits = {};
	
	var consumercode = self.DonorsList.consumercode;
	
	
	
	self.register = function register(){
		$log.log("-----Register Function-----");
		localService.register(self.registerData)
		.then(
			function(d){
				$log.log(self.registerData);
				self.registerd = d;
				self.SuccessMessage='New User Registerd SuccessFully';
				self.ErrorMessage='';
				//$log.log(self.registerd);
			},	
			function(errResponse){
				self.ErrorMessage='Error while Creating';
				$log.log("--------Error in Controller----");
			}
		);
	};

	self.fetchDonors = function fetchDonors(){
		$log.log("-----Fetch Donors------");
		localService.fetchDonors()
		.then(
				function(fetchResponse){
					$log.log("successfully fetched data");
					self.DonorsList = fetchResponse;
					$log.log(self.DonorsList);
			
		},function(errResponse){
			$log.log("Error while fetching");
			alert("Error while fetching");
		})
		
	};
	self.fetchDonors();
	
	
	self.createDonor =  function createDonor() {
         console.log('create donor');
         
         console.log(self.donar_info);
         localService.createDonor(self.donar_info)
             .then(
                 function (response) {
                     console.log('donor created successfully');
                     self.successMessage = 'donor created successfully';
                     self.errorMessage='';
                     self.done = true;
                  /*   self.user={};*/
                 },
                 function (errResponse) {
                     console.error('Error while creating donor');
                  /*   self.errorMessage = 'Error while creating donor:' + errResponse.data.errorMessage;
                     self.successMessage='';*/
                 }
             );
     };
     self.update = function update(DonorsList,consumerCode){ 
    	 $log.log(DonorsList);
    	 $log.log("aaaaaaaaa"+DonorsList.consumerCode);
    	 var ids =  DonorsList.consumerCode;
    	 localService.update(DonorsList,ids)
    	 .then(
    	function(d){
    		 $log.log("************");
    		 self.donar_info = DonorsList;
    		 self.fetchDonors();
    		 $log.log(d);
    		 self.registerd = data;
    	 },
    	 function(error){
    		 $log.log("*****Error*******");
    	 });
     };
	  
     self.edit = function edit(id){
    	 console.log('id to be edited', id);
         for(var i = 0; i < self.DonorsList.length; i++){
             if(self.DonorsList[i].registrationUserid === id) {
                 self.edits = angular.copy(self.DonorsList[i]);
                 break;
             }
         }
    	 
     };
	/* function updateDonor() {
		 console.log('update donor');
		 console.log(self.donar_info);
		 localService.updateDonor(self.donar_info)
		   .then(
	          function (response){
	        	  console.log('donor updated successfully');
	        	  self.successMessage = 'Donor updated successfully';
	          },
	          function(errResponse) {
	        	  console.error('Error while creating donor');
	          }
				   );
	 };
	 */
         
     /*$scope.getTemplate = function (DonorsList) {
    	 if (DonorsList.empID === $scope.selected.empID){
    	  return 'edit';
    	 }
    	 else return 'display';
    	};*/
  
	
	
}]);
/*myApp.directive("matchPassword", function () {
    return {
        require: "ngModel",
        scope: {
            otherModelValue: "=matchPassword"
        },
        link: function(scope, element, attributes, ngModel) {
            console.log("Passwordsssssssssss");
        	ngModel.$validators.matchPassword = function(modelValue) {
        		console.log(scope.otherModelValue);
                return modelValue == scope.otherModelValue;
            };
            scope.$watch("otherModelValue", function() {
            	console.log(scope.otherModelValue);
            	ngModel.$validate();
            });
        }
    };
}); */
