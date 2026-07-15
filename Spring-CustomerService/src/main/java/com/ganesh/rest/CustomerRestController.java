package com.ganesh.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.Customer;

@RestController
public class CustomerRestController {
	
	
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {
		
		Customer customer = new Customer(id, "Ganesh", "ganesh@gmail.com", 8857013765l, "Pune");
		
		return new ResponseEntity<Customer>(customer,HttpStatus.OK); 
	}
	
	
	
	
//	@GetMapping("/customer/{id}")
//	public ResponseEntity<Map<String, Object>> getCustomerById(@PathVariable Integer id) {
//		
//		Map<String, Object> customer = new LinkedHashMap<>();
//		
//		customer.put("Id", id);
//		customer.put("Name", "Ganesh");
//		customer.put("Address", "Pune");
//		customer.put("Mobile No", 8857013765l);
//		customer.put("Email", "ganesh@gmail.com");
//		
//		return new ResponseEntity<Map<String, Object>>(customer,HttpStatus.OK); 
//	}

}
