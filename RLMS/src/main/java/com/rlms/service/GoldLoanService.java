package com.rlms.service;

import com.rlms.dto.GoldLoanRequestDTO;
import com.rlms.dto.GoldLoanResponseDTO;

public interface GoldLoanService {
    GoldLoanResponseDTO createLoan(
            GoldLoanRequestDTO requestDTO);
}


