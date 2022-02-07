package com.BankApp.brandmodel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class brand {
    @Id
    int bid;
    String bname;
    public brand(){
    	
    }
	public brand(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
    
}
