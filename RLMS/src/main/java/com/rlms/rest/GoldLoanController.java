package com.rlms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlms.Exception.BusinessException;
import com.rlms.dto.GoldLoanRequestDTO;
import com.rlms.dto.GoldLoanResponseDTO;
import com.rlms.service.GoldLoanService;

@RestController
@RequestMapping("/gold-loans")

public class GoldLoanController {

	@Autowired
	private GoldLoanService goldLoanService;

	@PostMapping("/createloans")
	public ResponseEntity<GoldLoanResponseDTO> createLoan(@Validated @RequestBody GoldLoanRequestDTO requestDTO) throws BusinessException {

		GoldLoanResponseDTO response = goldLoanService.createLoan(requestDTO);

		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}
