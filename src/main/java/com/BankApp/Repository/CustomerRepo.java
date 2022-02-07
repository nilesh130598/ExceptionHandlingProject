package com.BankApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankApp.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	

}
