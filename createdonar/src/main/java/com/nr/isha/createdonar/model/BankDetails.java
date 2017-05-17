package com.nr.isha.createdonar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
 
public class BankDetails {
	@Id
	@Column(name="bankDetailsid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long bankDetailsid;
	private String bankDetailsAccountHolderName;
	private String bankDetailsBankName;
	private String bankDetailsAccountNo;
	private String bankDetailsBranch;
	private String bankDetailsIFSCCode;
	private String bankDetailsAccountType;
	
	@OneToOne
	@JoinColumn(name="bankDetailsid")
	private CreateDonar createDonar;

	public BankDetails() {
	System.out.println("BankDetails=>D.C");
	}
	
	public BankDetails(Long bankDetailsid) {
		super();
		this.bankDetailsid = bankDetailsid;
	}



	public BankDetails(String bankDetailsAccountHolderName, String bankDetailsBankName, String bankDetailsAccountNo,
			String bankDetailsBranch, String bankDetailsIFSCCode, String bankDetailsAccountType) {
		super();
		this.bankDetailsAccountHolderName = bankDetailsAccountHolderName;
		this.bankDetailsBankName = bankDetailsBankName;
		this.bankDetailsAccountNo = bankDetailsAccountNo;
		this.bankDetailsBranch = bankDetailsBranch;
		this.bankDetailsIFSCCode = bankDetailsIFSCCode;
		this.bankDetailsAccountType = bankDetailsAccountType;
	}



	public BankDetails(Long bankDetailsid, String bankDetailsAccountHolderName, String bankDetailsBankName,
			String bankDetailsAccountNo, String bankDetailsBranch, String bankDetailsIFSCCode,
			String bankDetailsAccountType) {
		super();
		this.bankDetailsid = bankDetailsid;
		this.bankDetailsAccountHolderName = bankDetailsAccountHolderName;
		this.bankDetailsBankName = bankDetailsBankName;
		this.bankDetailsAccountNo = bankDetailsAccountNo;
		this.bankDetailsBranch = bankDetailsBranch;
		this.bankDetailsIFSCCode = bankDetailsIFSCCode;
		this.bankDetailsAccountType = bankDetailsAccountType;
	}

	public Long getBankDetailsid() {
		return bankDetailsid;
	}

	public void setBankDetailsid(Long bankDetailsid) {
		this.bankDetailsid = bankDetailsid;
	}

	public String getBankDetailsAccountHolderName() {
		return bankDetailsAccountHolderName;
	}

	public void setBankDetailsAccountHolderName(String bankDetailsAccountHolderName) {
		this.bankDetailsAccountHolderName = bankDetailsAccountHolderName;
	}

	public String getBankDetailsBankName() {
		return bankDetailsBankName;
	}

	public void setBankDetailsBankName(String bankDetailsBankName) {
		this.bankDetailsBankName = bankDetailsBankName;
	}

	public String getBankDetailsAccountNo() {
		return bankDetailsAccountNo;
	}

	public void setBankDetailsAccountNo(String bankDetailsAccountNo) {
		this.bankDetailsAccountNo = bankDetailsAccountNo;
	}

	public String getBankDetailsBranch() {
		return bankDetailsBranch;
	}

	public void setBankDetailsBranch(String bankDetailsBranch) {
		this.bankDetailsBranch = bankDetailsBranch;
	}

	public String getBankDetailsIFSCCode() {
		return bankDetailsIFSCCode;
	}

	public void setBankDetailsIFSCCode(String bankDetailsIFSCCode) {
		this.bankDetailsIFSCCode = bankDetailsIFSCCode;
	}

	public String getBankDetailsAccountType() {
		return bankDetailsAccountType;
	}

	public void setBankDetailsAccountType(String bankDetailsAccountType) {
		this.bankDetailsAccountType = bankDetailsAccountType;
	}

	public CreateDonar getCreateDonar() {
		return createDonar;
	}

	public void setCreateDonar(CreateDonar createDonar) {
		this.createDonar = createDonar;
	}

	@Override
	public String toString() {
		return "BankDetails [bankDetailsid=" + bankDetailsid + ", bankDetailsAccountHolderName="
				+ bankDetailsAccountHolderName + ", bankDetailsBankName=" + bankDetailsBankName
				+ ", bankDetailsAccountNo=" + bankDetailsAccountNo + ", bankDetailsBranch=" + bankDetailsBranch
				+ ", bankDetailsIFSCCode=" + bankDetailsIFSCCode + ", bankDetailsAccountType=" + bankDetailsAccountType
				 + "]";
	}
	
	
	

}
