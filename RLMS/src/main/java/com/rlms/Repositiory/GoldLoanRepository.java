package com.rlms.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rlms.entity.GoldLoan;
@Repository
public interface GoldLoanRepository extends JpaRepository<GoldLoan,Long>{

}
