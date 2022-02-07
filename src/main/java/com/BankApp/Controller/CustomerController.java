package com.BankApp.Controller;
import com.BankApp.Exception.CustomerCannotBeNegative;
import com.BankApp.Exception.CustomerNotFoundException;
import com.BankApp.Model.Balance;
import com.BankApp.Model.Customer;

import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BankApp.Model.Customer;
import com.BankApp.Service.BalanceService;
import com.BankApp.Service.CustomerService;
@RestController
@RequestMapping
public class CustomerController {

	@Autowired
	CustomerService customerservice;
	@Autowired
	BalanceService balanceservice;
	@GetMapping("/nilesh")
	public String m1(){
		return "hii nilesh";
	}
	@PostMapping("/customer")
	public Customer AddCustomer(@RequestBody Customer c1){
		Customer result = customerservice.SaveCustomer(c1);
		return result;
	}
	@PostMapping("/balance")
	public Balance AddBalance(@RequestBody Balance b1){
		Balance balance = balanceservice.SaveBalance(b1);
		return balance;
	}
	@GetMapping("/balance/{cpin}")
	public Optional<Balance> GetBalance(@PathVariable int cpin){
		if(cpin==0){
			throw new CustomerNotFoundException();
		}
		if(cpin<0){
			throw new CustomerCannotBeNegative();
		}
		try{
		Optional<Balance> balance = balanceservice.getBalance(cpin);
		return balance;
		}catch (Exception e) {
			throw new CustomerNotFoundException();
		}
		
	}
	@GetMapping("/customer/{cpin}")
	public Customer GetCustomer(@PathVariable int cpin){
		Customer customer = customerservice.getCustomer(cpin);
		return customer;
		
	}
	@PutMapping("/credit")
	public Balance CreditBalance(@RequestBody Balance b2){
		System.out.println(b2.getCamount());
		Balance balance1 = balanceservice.AddBalance(b2);
		return balance1;
	}
}
 