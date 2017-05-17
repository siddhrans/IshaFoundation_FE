package com.nr.isha.createdonar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.nr.isha.createdonar.model.BankDetails;
import com.nr.isha.createdonar.model.CreateDonar;
import com.nr.isha.createdonar.model.PaymentDetails;
import com.nr.isha.createdonar.service.DonarService;
 
 
 
@Controller
public class DonarController {
	
@Autowired
DonarService donarService;


	@RequestMapping(method=RequestMethod.POST, value="/donar1/")
	 public ResponseEntity<?>  addUser(@RequestBody CreateDonar createDonar, UriComponentsBuilder ucBuilder){
		 System.out.println("HomeController->addUse->"+createDonar);
		 BankDetails bankDetails=new BankDetails(createDonar.getBankDetails().getBankDetailsAccountHolderName(),createDonar.getBankDetails().getBankDetailsBankName(),createDonar.getBankDetails().getBankDetailsAccountNo(),createDonar.getBankDetails().getBankDetailsBranch(), createDonar.getBankDetails().getBankDetailsIFSCCode(),createDonar.getBankDetails().getBankDetailsAccountType());
		 System.out.println("DonarService->add(Bankdetails)->"+bankDetails);
		 PaymentDetails paymentDetails=new PaymentDetails(createDonar.getPaymentDetails().getPaymentDetailsStartDate(),createDonar.getPaymentDetails().getPaymentDetailsEndDate(),createDonar.getPaymentDetails().getPaymentDetailsAmountInRs(),createDonar.getPaymentDetails().getPaymentDetailsFrequency());
			System.out.println("DonarService->add(Bankdetails)->"+paymentDetails);
			/* 
			donarService.saveBankDetails(bankDetails);
			donarService.savePaymentDetails(paymentDetails);*/
		 donarService.saveDonar(createDonar);
		 /*boolean verify=donarService.isUserExist(createDonar);
		 if(verify){
			 return new ResponseEntity("Unable to create. A User with name " + 
					 createDonar.getDonarlastname() + " already exist.",HttpStatus.CONFLICT);
		 }else{
			 donarService.add(createDonar);
		 }*/
		 HttpHeaders headers = new HttpHeaders();
			headers.setLocation(ucBuilder.path("/donar1/{id}").buildAndExpand(createDonar.getConsumerCode()).toUri());
			return new ResponseEntity<String>(headers, HttpStatus.CREATED);
		 
		  
	 }
	 
	
	
}
