package com.BankApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankApp.Model.Balance;

public interface BalanceRepo extends JpaRepository<Balance, Integer>{
	

}
