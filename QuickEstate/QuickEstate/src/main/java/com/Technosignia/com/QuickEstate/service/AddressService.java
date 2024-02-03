package com.Technosignia.com.QuickEstate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.com.QuickEstate.entity.Address;
import com.Technosignia.com.QuickEstate.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
public Address createAddress(Address address) {
	return addressRepository.save(address);
	}
}
