package com.Technosignia.com.QuickEstate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.com.QuickEstate.entity.Customer;
import com.Technosignia.com.QuickEstate.service.CustomerService;

@RestController
public class CustomerController {
@Autowired
CustomerService customerService;
	
@PostMapping("/customer")
public Customer CreateCustomerDetails(@RequestBody Customer customer) {
return customerService.createCustomer(customer)	;
}
}