package com.BankApp.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionController {
	 @ExceptionHandler(value = CustomerNotFoundException.class)
	   public ResponseEntity<Object> exception(CustomerNotFoundException exception) {
	      return new ResponseEntity<>("Customer not found in database", HttpStatus.NOT_FOUND);
	   }
	 @ExceptionHandler(value = CustomerCannotBeNegative.class)
	   public ResponseEntity<Object> exception(CustomerCannotBeNegative exception) {
	      return new ResponseEntity<>("Customer cannot be negative", HttpStatus.NOT_FOUND);
	   }
	 
}
