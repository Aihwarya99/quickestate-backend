package com.Technosignia.com.QuickEstate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.QuickEstate.entity.Customer;
import com.Technosignia.com.QuickEstate.repository.CustomerRepository;

@Service
public class CustomerService {
@Autowired
CustomerRepository customerRepository;
public Customer createCustomer(Customer cus)
{
	return customerRepository.save(cus);
}

}
