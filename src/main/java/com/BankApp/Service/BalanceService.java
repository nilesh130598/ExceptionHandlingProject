package com.BankApp.Service;

import java.io.Serializable;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankApp.Exception.CustomerNotFoundException;
import com.BankApp.Model.Balance;
import com.BankApp.Repository.BalanceRepo;

import ch.qos.logback.core.joran.conditional.ThenOrElseActionBase;
import net.bytebuddy.implementation.bytecode.Throw;

@Service
@Transactional
public class BalanceService  {
	@Autowired
	BalanceRepo balancerepo;
	
	public Balance SaveBalance(Balance balance){
		Balance Addedbalance = balancerepo.save(balance);
		return  Addedbalance;
	}
	
	public Optional<Balance> getBalance(int cpin){
		try{
		Optional<Balance> balance = balancerepo.findById(cpin);
		if(balance.isPresent()){
			return balance;
		}
	throw new CustomerNotFoundException();
		}catch (Exception e) {
		throw new CustomerNotFoundException();
		}
		
		
		
		
	}
	
	public Balance AddBalance(Balance balance){
	Balance b2 = balancerepo.getById(balance.getCpin());
	System.out.println(b2.getCpin());
	int amount = b2.getCamount() + balance.getCamount();
	balance.setCamount(amount);
	Balance b3= balancerepo.save(balance);
	return b3;
	
	}
}
