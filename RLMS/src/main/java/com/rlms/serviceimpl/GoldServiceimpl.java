package com.rlms.serviceimpl;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rlms.Repositiory.CustomerRepository;
import com.rlms.Repositiory.GoldLoanRepository;
import com.rlms.dto.GoldLoanRequestDTO;
import com.rlms.dto.GoldLoanResponseDTO;
import com.rlms.entity.Customer;
import com.rlms.entity.GoldLoan;
import com.rlms.service.GoldLoanService;

@Service

public class GoldServiceimpl implements GoldLoanService {
	private static final Logger log = LoggerFactory.getLogger(GoldServiceimpl.class);

	@Autowired
	private  GoldLoanRepository goldLoanRepository ;
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public GoldLoanResponseDTO createLoan(GoldLoanRequestDTO requestDTO) {

		log.info("Create loan started");

	//	Customer customer = customerRepository.findById(requestDTO.getCustomerId())
				//.orElseThrow();

//		GoldLoan goldLoan = GoldLoan.builder().loanAmount(requestDTO.getLoanAmount())
//				.interestRate(requestDTO.getInterestRate()).loanStatus("ACTIVE").loanDate(LocalDate.now())
//				.customer(customer).build();
		
		GoldLoan goldLoan = new GoldLoan();
		
goldLoan.setInterestRate(requestDTO.getInterestRate());

goldLoan.setLoanAmount(requestDTO.getLoanAmount());

goldLoan.setLoanDate(LocalDate.now());
goldLoan.setLoanStatus("Active");
goldLoan.setInterestRate(requestDTO.getInterestRate());

		GoldLoan savedLoan = goldLoanRepository.save(goldLoan);

		log.info("Loan created successfully");

		/*
		 * return
		 * GoldLoanResponseDTO.builder().loanId(savedLoan.getLoanId()).customerName(
		 * customer.getCustomerName())
		 * .loanAmount(savedLoan.getLoanAmount()).interestRate(savedLoan.getInterestRate
		 * ()) .loanStatus(savedLoan.getLoanStatus()).build();
		 */
		GoldLoanResponseDTO goldLoanRes = new GoldLoanResponseDTO();
		goldLoanRes.setLoanAmount(savedLoan.getLoanAmount());
		goldLoanRes.setInterestRate(savedLoan.getInterestRate());
		goldLoanRes.setLoanId(savedLoan.getLoanId());
		goldLoanRes.setLoanStatus(savedLoan.getLoanStatus());
		
		return goldLoanRes;
		
	}
}
