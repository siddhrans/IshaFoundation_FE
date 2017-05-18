'use strict';
var CreateApp = angular.module('myApp',[]);
CreateApp.controller("CreateController",['$scope','donarservice','$log',function($scope,donarservice,$log){
	
	
	$log.log("Controller........");
	var self= this;
	self.createdonar=createdonar;
	self.donar_info= { donarfirstname:"",donarlastname:"",donaremail:"",donarmobile:"",donarAddress:"",
		        donarRegion:"",donarCity:"",donarState:"",donarCenter:"",bankDetails : {
		        bankDetailsAccountHolderName:"",bankDetailsBankName:"",bankDetailsAccountNo:"",
		        bankDetailsBranch:"",bankDetailsIFSCCode:"",bankDetailsAccountType:""
		        },paymentDetails : {
		        paymentDetailsStartDate:"",paymentDetailsEndDate:"",paymentDetailsAmountInRs:"",
		        paymentDetailsFrequency:"" }
	};
/*	createdonar();*/
	function createdonar(){
		donarservice.createdonar(donar_info)
		.then(
				createdonar,
				function(errResponse){
					  console.error('Error while creating User');
				}
		);	
		}
	/*function submit()
	{   
		$log.log("submit...........");
		alert("alert user created successfully");
		windows.location.href="http://localhost:6511/success_page.html";
	}*/
}]);