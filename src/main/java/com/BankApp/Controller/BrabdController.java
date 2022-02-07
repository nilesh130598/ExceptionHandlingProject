package com.BankApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrabdController {
  
	@GetMapping("/hiii")
	public String get(){
		return "working";
	}
}
