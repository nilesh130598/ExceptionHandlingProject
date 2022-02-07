package com.BankApp.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Balance implements Serializable {
@Id
int Cpin;
int Camount;
public Balance(){
	
}

public Balance(int cpin, int camount) {
	super();
	Cpin = cpin;
	Camount = camount;
}
public int getCpin() {
	return Cpin;
}
public void setCpin(int cpin) {
	Cpin = cpin;
}
public int getCamount() {
	return Camount;
}
public void setCamount(int camount) {
	Camount = camount;
}
@Override
public String toString() {
	return "Balance [Cpin=" + Cpin + ", Camount=" + Camount + ", getCpin()=" + getCpin() + ", getCamount()="
			+ getCamount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

public Balance orElseThrow(Object object) {
	// TODO Auto-generated method stub
	return null;
}

}
