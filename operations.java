package com.example.demo;

import org.springframework.stereotype.Component;

@Component("ob2")
public class operations {
Double amount=4000.0;


public void deposit(double amt) {
	this.amount=this.amount+amt;
	System.out.println("Entered Amount is Added to the account ");
	System.out.println("Account balance :"+this.amount);
}

public void withdraw(double amt) {
	if(amt>this.amount) {
		System.out.println("the given amount is exeeded the balance amount...");
		
	}
	else {
		this.amount=this.amount-amt;
		System.out.println("Account balance :"+this.amount);
	}
}

public void checkbal() {
	System.out.println("Account Balance : "+this.amount);
}
}
