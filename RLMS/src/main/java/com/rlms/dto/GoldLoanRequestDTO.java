package com.rlms.dto;

import java.math.BigDecimal;

import org.antlr.v4.runtime.misc.NotNull;

public class GoldLoanRequestDTO {

    @NotNull
    private Long customerId;

    public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	@NotNull
    private BigDecimal loanAmount;

    @NotNull
    private BigDecimal interestRate;
}
