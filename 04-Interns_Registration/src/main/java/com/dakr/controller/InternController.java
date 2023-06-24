package com.dakr.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.dakr.model.Interns;
import com.dakr.service.InternServiceImpl;

@RestController
public class InternController {
	
	@Autowired
	public InternServiceImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<Interns> saveInternsDetails(@Valid @RequestBody Interns i1) {
	
		return new ResponseEntity<> (service.internsDetails(i1),HttpStatus.BAD_REQUEST);
		
	}
	
	
	@GetMapping("/getOne/{internId}")
	public ResponseEntity<Interns> getOne( @PathVariable Integer internId ) {
		
		return ResponseEntity.ok( service.getIntern(internId));
		
	}
	@GetMapping("/getall")
	public ResponseEntity <List<Interns>> getAll(){
		return ResponseEntity.ok(service.getAllInterns());
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Interns> updateIntern(@Valid@RequestBody Interns ien4) {
		return ResponseEntity.ok( service.updateInterndetails(ien4));
	}
	@PutMapping("/updateIntern")
	public Interns updateInterns(@RequestBody Interns ien3) {
		return service.updateInterns(ien3);
	}
	
	@DeleteMapping("/deleteOne/{ienId}")
	public void deleteOne(@PathVariable Integer ienId ) {
		service.deleteOneEmp(ienId);
		}
	@DeleteMapping("/deleteAll")
	public void deleteall() {
		service.deleteAllInterns();
	}
	
	

}
