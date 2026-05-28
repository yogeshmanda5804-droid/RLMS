package com.rlms.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rlms.entity.Customer;
import com.rlms.entity.GoldLoan;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

	Customer findByMobileNumber(String mobilenum);
}
