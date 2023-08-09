package com.example.demo;

import org.springframework.stereotype.Component;

@Component("ob1")
public class createAccount {
	
	String username;
	int acc=10001;
	int Accno;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAccno() {
		return Accno;
	}
	
	public void setdetails(String username) {
		
		this.Accno=acc;
		
		acc++;
		this.username=username;

	}
	
	
}
