package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private IcustomerService service;
	
	//1. to save the data
	@PostMapping("/register")
	public ResponseEntity<String> saveCourse(@RequestBody Customer c)
	{
		Integer id=service.savecustomer(c);
		ResponseEntity<String> resp=new ResponseEntity<String>("Customer "+id+" Generated",HttpStatus.CREATED);
		return resp;
	}
	
	@GetMapping("/all")
	public List<Customer> getAllCourse()
	{
		List<Customer> allCourse=service.AllCustomers();
		return allCourse;
		}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getcustomerbyid(@PathVariable Integer id){
		Customer customer = service.getOneCustomer(id);
		ResponseEntity<?> resp = null;
		try {
			resp = ResponseEntity.ok(customer);
			
		}
		catch(Exception ae) {
			resp = new ResponseEntity<String>("Unable to fetch data",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
	@PutMapping("/update")
	public ResponseEntity<Customer> updatecustomer(@RequestBody Customer upd){
		Customer customer = service.updatecustomer(upd);
		if(customer != null) {
			return new ResponseEntity<>(customer,HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
