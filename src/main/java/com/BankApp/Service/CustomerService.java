package com.BankApp.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankApp.Model.Customer;
import com.BankApp.Repository.CustomerRepo;
@Service
@Transactional
public class CustomerService {
	@Autowired
	CustomerRepo customerrepo;
	
	public Customer SaveCustomer(Customer cust){
		Customer AddedCustomer = customerrepo.save(cust);
		return AddedCustomer;
	}
	public Customer getCustomer(int cpin){
		Customer customer = customerrepo.getById(cpin);
		return customer;
	}
}
