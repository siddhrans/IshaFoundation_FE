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
 
public class PaymentDetails {
	@Id
	@Column(name="paymentDetailsId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long paymentDetailsId;
	String paymentDetailsStartDate;
	String paymentDetailsEndDate;
	Double paymentDetailsAmountInRs;
	String paymentDetailsFrequency;
	@OneToOne
	@JoinColumn(name="paymentDetailsId")
	private CreateDonar createDonar;
	
	public PaymentDetails() {
	 System.out.println("PaymentDetails->D.C");
	}
	
	public PaymentDetails(Long paymentDetailsId) {
		super();
		this.paymentDetailsId = paymentDetailsId;
	}

	public PaymentDetails(String paymentDetailsStartDate, String paymentDetailsEndDate, Double paymentDetailsAmountInRs,
			String paymentDetailsFrequency) {
		super();
		this.paymentDetailsStartDate = paymentDetailsStartDate;
		this.paymentDetailsEndDate = paymentDetailsEndDate;
		this.paymentDetailsAmountInRs = paymentDetailsAmountInRs;
		this.paymentDetailsFrequency = paymentDetailsFrequency;
	}

	public PaymentDetails(Long paymentDetailsId, String paymentDetailsStartDate, String paymentDetailsEndDate,
			Double paymentDetailsAmountInRs, String paymentDetailsFrequency) {
		super();
		this.paymentDetailsId = paymentDetailsId;
		this.paymentDetailsStartDate = paymentDetailsStartDate;
		this.paymentDetailsEndDate = paymentDetailsEndDate;
		this.paymentDetailsAmountInRs = paymentDetailsAmountInRs;
		this.paymentDetailsFrequency = paymentDetailsFrequency;
	}
	
	

	public Long getPaymentDetailsId() {
		return paymentDetailsId;
	}

	public void setPaymentDetailsId(Long paymentDetailsId) {
		this.paymentDetailsId = paymentDetailsId;
	}

	public String getPaymentDetailsStartDate() {
		return paymentDetailsStartDate;
	}

	public void setPaymentDetailsStartDate(String paymentDetailsStartDate) {
		this.paymentDetailsStartDate = paymentDetailsStartDate;
	}

	public String getPaymentDetailsEndDate() {
		return paymentDetailsEndDate;
	}

	public void setPaymentDetailsEndDate(String paymentDetailsEndDate) {
		this.paymentDetailsEndDate = paymentDetailsEndDate;
	}

	public Double getPaymentDetailsAmountInRs() {
		return paymentDetailsAmountInRs;
	}

	public void setPaymentDetailsAmountInRs(Double paymentDetailsAmountInRs) {
		this.paymentDetailsAmountInRs = paymentDetailsAmountInRs;
	}

	public String getPaymentDetailsFrequency() {
		return paymentDetailsFrequency;
	}

	public void setPaymentDetailsFrequency(String paymentDetailsFrequency) {
		this.paymentDetailsFrequency = paymentDetailsFrequency;
	}

	public CreateDonar getCreateDonar() {
		return createDonar;
	}

	public void setCreateDonar(CreateDonar createDonar) {
		this.createDonar = createDonar;
	}

	@Override
	public String toString() {
		return "PaymentDetails [paymentDetailsId=" + paymentDetailsId + ", paymentDetailsStartDate="
				+ paymentDetailsStartDate + ", paymentDetailsEndDate=" + paymentDetailsEndDate
				+ ", paymentDetailsAmountInRs=" + paymentDetailsAmountInRs + ", paymentDetailsFrequency="
				+ paymentDetailsFrequency + ", createDonar=" + createDonar + "]";
	}

	 

}
