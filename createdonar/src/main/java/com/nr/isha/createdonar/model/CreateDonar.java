package com.nr.isha.createdonar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
 
public class CreateDonar {
	@Id
	@Column(name="consumerCode")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long consumerCode;
	private String donarfirstname;
	private String donarlastname;
	private String donaremail;
	private Long donarmobile;
	private String donarAddress;
	private String donarRegion;
	private String donarCity;
	private String donarState;
	private String donarCenter;
	
	@OneToOne
	@JoinColumn(name="bankDetailsid")
	private BankDetails bankDetails;
	
	@OneToOne
	@JoinColumn(name="paymentDetailsId")
	private PaymentDetails paymentDetails;

	public CreateDonar() {
		System.out.println("CreateDonar->D.C");
	}
	
	
	public CreateDonar(Long consumerCode) {
		super();
		this.consumerCode = consumerCode;
	}

	public CreateDonar(Long consumerCode, String donarfirstname, String donarlastname, String donaremail,
			Long donarmobile, String donarAddress, String donarRegion, String donarCity, String donarState,
			String donarCenter) {
		super();
		this.consumerCode = consumerCode;
		this.donarfirstname = donarfirstname;
		this.donarlastname = donarlastname;
		this.donaremail = donaremail;
		this.donarmobile = donarmobile;
		this.donarAddress = donarAddress;
		this.donarRegion = donarRegion;
		this.donarCity = donarCity;
		this.donarState = donarState;
		this.donarCenter = donarCenter;
		
	}

	public CreateDonar(String donarfirstname, String donarlastname, String donaremail, Long donarmobile,
			String donarAddress, String donarRegion, String donarCity, String donarState, String donarCenter) {
		super();
		this.donarfirstname = donarfirstname;
		this.donarlastname = donarlastname;
		this.donaremail = donaremail;
		this.donarmobile = donarmobile;
		this.donarAddress = donarAddress;
		this.donarRegion = donarRegion;
		this.donarCity = donarCity;
		this.donarState = donarState;
		this.donarCenter = donarCenter;
		 
		
	}

	public Long getConsumerCode() {
		return consumerCode;
	}

	public void setConsumerCode(Long consumerCode) {
		this.consumerCode = consumerCode;
	}

	public String getDonarfirstname() {
		return donarfirstname;
	}

	public void setDonarfirstname(String donarfirstname) {
		this.donarfirstname = donarfirstname;
	}

	public String getDonarlastname() {
		return donarlastname;
	}

	public void setDonarlastname(String donarlastname) {
		this.donarlastname = donarlastname;
	}

	public String getDonaremail() {
		return donaremail;
	}

	public void setDonaremail(String donaremail) {
		this.donaremail = donaremail;
	}

	public Long getDonarmobile() {
		return donarmobile;
	}

	public void setDonarmobile(Long donarmobile) {
		this.donarmobile = donarmobile;
	}

	public String getDonarAddress() {
		return donarAddress;
	}

	public void setDonarAddress(String donarAddress) {
		this.donarAddress = donarAddress;
	}

	public String getDonarRegion() {
		return donarRegion;
	}

	public void setDonarRegion(String donarRegion) {
		this.donarRegion = donarRegion;
	}

	public String getDonarCity() {
		return donarCity;
	}

	public void setDonarCity(String donarCity) {
		this.donarCity = donarCity;
	}

	public String getDonarState() {
		return donarState;
	}

	public void setDonarState(String donarState) {
		this.donarState = donarState;
	}

	public String getDonarCenter() {
		return donarCenter;
	}

	public void setDonarCenter(String donarCenter) {
		this.donarCenter = donarCenter;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}


	@Override
	public String toString() {
		return "CreateDonar [consumerCode=" + consumerCode + ", donarfirstname=" + donarfirstname + ", donarlastname="
				+ donarlastname + ", donaremail=" + donaremail + ", donarmobile=" + donarmobile + ", donarAddress="
				+ donarAddress + ", donarRegion=" + donarRegion + ", donarCity=" + donarCity + ", donarState="
				+ donarState + ", donarCenter=" + donarCenter +   "]";
	}
	
	
	

}
