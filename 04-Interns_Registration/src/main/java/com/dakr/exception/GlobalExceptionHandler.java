package com.dakr.exception;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
		
	public Map<String, String>handleException(MethodArgumentNotValidException ex){
		
		Map<String, String> errMap=new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach(error ->{
			errMap.put(error.getDefaultMessage(), error.getDefaultMessage());
		});
		
		return errMap;
	}
		
	}
	
	


