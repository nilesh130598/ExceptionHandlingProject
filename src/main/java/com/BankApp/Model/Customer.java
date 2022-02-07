package com.BankApp.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="Customer")
public class Customer implements Serializable {
@Id
int Cpin;
String Cname;
String Caddress;
public Customer(){
	
}

public Customer(int cpin, String cname, String caddress) {
	super();
	Cpin = cpin;
	Cname = cname;
	Caddress = caddress;
}
public int getCpin() {
	return Cpin;
}
public void setCpin(int cpin) {
	Cpin = cpin;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public String getCaddress() {
	return Caddress;
}
public void setCaddress(String caddress) {
	Caddress = caddress;
}
@Override
public String toString() {
	return "Customer [Cpin=" + Cpin + ", Cname=" + Cname + ", Caddress=" + Caddress + ", getCpin()=" + getCpin()
			+ ", getCname()=" + getCname() + ", getCaddress()=" + getCaddress() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}
