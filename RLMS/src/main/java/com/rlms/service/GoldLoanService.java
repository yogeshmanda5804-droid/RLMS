package com.rlms.service;

import java.math.BigDecimal;

import com.rlms.dto.Employeeresponsedto;
import com.rlms.dto.GoldLoanRequestDTO;
import com.rlms.dto.GoldLoanResponseDTO;

public interface GoldLoanService {
	GoldLoanResponseDTO createLoan(GoldLoanRequestDTO requestDTO);

	BigDecimal calculateInterest(BigDecimal loanAmount, BigDecimal interestRate);
	
	 Employeeresponsedto
	    getEmployee(Long employeeId);
	
}
