package com.dakr.globalexeption;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ExceptionAdvice {
	
	 @ExceptionHandler(NoSuchElementException.class)
	 public ResponseEntity<String>handleNoSuchElementException(NoSuchElementException elementException)
	 {
		 
		 return new ResponseEntity<String>("No such elements are present in Database ,please give right input ", HttpStatus.NOT_FOUND);
	 }
	   
	    

}
