'use strict';
var app=angular.module("donorApp",[]);
app.controller("donorController",function($scope,$http,$location,$log){
	$log.log("Controller...........");
	var self = this;
	var url = "http://localhost:6511/donar1/";
	self.submit = submit;
	self.donar_info = { donarfirstname:"",donarlastname:"",donaremail:"",donarmobile:"",donarAddress:"",
		        donarRegion:"",donarCity:"",donarState:"",donarCenter:"",bankDetails : {
		        bankDetailsAccountHolderName:"",bankDetailsBankName:"",bankDetailsAccountNo:"",
		        bankDetailsBranch:"",bankDetailsIFSCCode:"",bankDetailsAccountType:""
		        },paymentDetails : {
		        paymentDetailsStartDate:"",paymentDetailsEndDate:"",paymentDetailsAmountInRs:"",
		        paymentDetailsFrequency:"" }
	};

	function submit(){
		console.log("1111111111111111111111");
		$http.post(url,self.donar_info)
		.then(function(res){
			console.log("************************");
			alert("donar createred");
			window.location.href="http://localhost:6511/success_page.html"; 
		})
		.then(function(res){
			alert("connection established"); 
		});
	}

});

