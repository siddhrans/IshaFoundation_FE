package com.nr.isha.createdonar.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nr.isha.createdonar.model.BankDetails;
import com.nr.isha.createdonar.model.CreateDonar;
import com.nr.isha.createdonar.model.PaymentDetails;
import com.nr.isha.createdonar.repositoty.BankDetailsRepository;
import com.nr.isha.createdonar.repositoty.DonarRepository;
import com.nr.isha.createdonar.repositoty.PaymentDetialsRepository;

@Service
@Transactional
public class DonarService {

	@Autowired
	DonarRepository donarRepository;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	BankDetailsRepository bankDetailsRepository;
	
	@Autowired
	 PaymentDetialsRepository paymentDetialsRepository;
	
	
	public boolean isUserExist(CreateDonar createDonar) {
		 String query="select * from CreateDonar where donarfirstname=? and donarlastname=? and donarmobile=?";
		 
		List<CreateDonar> createDonarTemp=jdbcTemplate.query(query, new DonarRowMapper());
		while(createDonarTemp!=null){
			return true;
		}
		return false;
	}
	
	

	public void saveDonar(CreateDonar createDonar) {
		 
		  BankDetails bankDetails=new BankDetails(createDonar.getBankDetails().getBankDetailsAccountHolderName(),createDonar.getBankDetails().getBankDetailsBankName(),createDonar.getBankDetails().getBankDetailsAccountNo(),createDonar.getBankDetails().getBankDetailsBranch(), createDonar.getBankDetails().getBankDetailsIFSCCode(),createDonar.getBankDetails().getBankDetailsAccountType());
		 System.out.println("DonarService->add(Bankdetails)->"+bankDetails);
		 
		 bankDetailsRepository.save(bankDetails);
		PaymentDetails paymentDetails=new PaymentDetails(createDonar.getPaymentDetails().getPaymentDetailsStartDate(),createDonar.getPaymentDetails().getPaymentDetailsEndDate(),createDonar.getPaymentDetails().getPaymentDetailsAmountInRs(),createDonar.getPaymentDetails().getPaymentDetailsFrequency());
		System.out.println("DonarService->add(Bankdetails)->"+paymentDetails);
		paymentDetialsRepository.save(paymentDetails); 
		
		//donarRepository.save(createDonar.getBankDetails());
		createDonar.setPaymentDetails(paymentDetails); 
		 donarRepository.save(createDonar);
		 createDonar.setBankDetails(bankDetails);
		 paymentDetialsRepository.save(paymentDetails);
		
	}

	public void saveBankDetails(BankDetails bankDetails) {
		 
		bankDetailsRepository.save(bankDetails);
	}
	public void savePaymentDetails(PaymentDetails paymentDetails) {
		paymentDetialsRepository.save(paymentDetails); 
	}
	
	
	 
}
class DonarRowMapper implements RowMapper<CreateDonar>
{
    @Override
    public CreateDonar mapRow(ResultSet rs, int rowNum) throws SQLException {
    	CreateDonar createDonar = new CreateDonar();
        //user.setId(rs.getLong("id"));
    	createDonar.setDonarfirstname(rs.getString("donarfirstname"));
    	 
    	createDonar.setDonarlastname(rs.getString("donarlastname")); 
    	createDonar.setDonarmobile(rs.getLong("donarmobile"));
        return createDonar;
    }

	 
}
