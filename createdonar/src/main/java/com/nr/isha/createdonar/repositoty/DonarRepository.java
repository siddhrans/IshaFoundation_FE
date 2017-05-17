package com.nr.isha.createdonar.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nr.isha.createdonar.model.CreateDonar;

@Repository
public interface DonarRepository extends JpaRepository<CreateDonar,Long>{

	//void saveAll(CreateDonar createDonar);

//	CreateDonar find(String donarfirstname);
	

}
