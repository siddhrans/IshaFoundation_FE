'use strict';
var myApp = angular.module("loginApp",[]);
myApp.controller("loginController",['$log','$scope','localService','$http',function($log,$scope,localService,$httpa){
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

	self.DonorsList = [];
	self.successMessage = '';
    self.errorMessage = '';
	self.onlyNumbers = /^\d+([,.]\d+)?$/;
	
	var url='http://localhost:6512/donar1/';
	self.editUser = {};
	
	
	/* drop down validation */	
	$scope.type = [{
        id: "a",
        value: "SB"
    }, {
        id: "b",
        value: "CA"
    },{
    	id: "c",
        value: "SB-NRE"
    },{ 
    	id: "d",
        value: "SB-NR0"
    },{
	    id: "e",
       value: "Other"
}];
	
	$scope.amountFrequency = [{
        id: "a",
        value: "Daily"
    }, {
        id: "b",
        value: "Weekly"
    },{
    	id: "c",
        value: "Quarterly"
    },{ 
    	id: "d",
        value: "Semi-Annually"
    },{
	    id: "e",
        value: "Yearly"
    },{
        id: "f",
        value: "Bi-Monthly"
    },{
        id: "g",
        value: "As And When Presented"
}];
 
	
	self.register = function register(){
		$log.log("-----Register Function-----");
		$log.log(self.registerData.registrationPasscode+" andd    "+self.registerData.registrationConfirmPasscode);
		if(self.registerData.registrationPasscode == self.registerData.registrationConfirmPasscode){
			localService.register(self.registerData)
			.then(
				function(d){
					$log.log(self.registerData);
					self.registerd = d;
					self.SuccessMessage='New User Registerd SuccessFully';
					alert("registered SuccessFully");
					
					self.ErrorMessage='';
					//$log.log(self.registerd);
				},	
				function(errResponse){
					self.ErrorMessage='Error while Creating';
					$log.log("--------Error in Controller----");
				}
			);
		}else {
			self.ErrorMessage="Passwords didn't match!! Please try again.";
			/*window.location.href="http://localhost:6512/login.html";*/
			$log.log("Error while Registering");
		}
		
	};

	self.fetchDonors = function fetchDonors(){
		$log.log("-----Fetch Donors------");
		localService.fetchDonors()
		.then(
				function(fetchResponse){
					$log.log("successfully fetched data");
					self.DonorsList = fetchResponse;
					self.OldDonors = self.DonorsList.length;
					$log.log(self.OldDonors);
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
     self.update = function update(donar_info){
    	 $log.log(donar_info);
    	 localService.update(donar_info)
    	 .then(function(response){
    		 $log.log(response.data);
    		 self.DonorsList = response.data;
    	 },function(erresponse){
    		 $log.log("Error while upadting"+erresponse);
    		 
    	 });
    	 
     }
     
	self.edit = function edit(id){
		$log.log("The id to be Edited"+id);
		for(var i=0; i<self.DonorsList.length;i++){
			if(self.DonorsList[i].consumerCode == id){
			self.donar_info = angular.copy(self.DonorsList[i]);
			break;
			}
		}
	}
	self.selectContact = function(index){
		self.selectedContact = self.DonorsList[index];
	}
	
}]);
