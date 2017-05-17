package com.nr.isha.createdonar.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

 
import com.nr.isha.createdonar.model.PaymentDetails;

public interface PaymentDetialsRepository extends JpaRepository<PaymentDetails,Long>{

}
