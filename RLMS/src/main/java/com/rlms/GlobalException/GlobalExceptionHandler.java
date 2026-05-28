package com.rlms.GlobalException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rlms.Exception.BusinessException;
@RestControllerAdvice
public class GlobalExceptionHandler {
	  @ExceptionHandler(BusinessException.class)
	public ResponseEntity<String> handleBusinessException(BusinessException ex) {

		return ResponseEntity.badRequest().body(ex.getMessage());
	}

	  
	  @ExceptionHandler(Exception.class)
	  public ResponseEntity<String> handlexception(Exception e){
		return ResponseEntity.internalServerError().body("Something went wrong");
		  
	  }
}
