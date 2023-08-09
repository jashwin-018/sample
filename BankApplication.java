package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(BankApplication.class, args);
		createAccount ca= ac.getBean("ob1",createAccount.class);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name :");
		String uname=sc.nextLine();
		ca.setdetails(uname);
		System.out.println("user : "+ca.getUsername());
		System.out.println("Account Number : "+ca.getAccno());
		
		
		
		operations ca1= (operations)ac.getBean("ob2",operations.class);
		int n;
		do {
			System.out.println("Choose one ");
			System.out.println("1.Deposit ");
			System.out.println("2.Withdraw ");
			System.out.println("3.Check Balance ");
			n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter Amount to deposit : ");
				double amt=sc.nextDouble();
				ca1.deposit(amt);
				break;
			case 2:
				System.out.println("Enter Amount to Withdraw : ");
				double amnt=sc.nextDouble();
				ca1.withdraw(amnt);
				break;
			}
			
			
		}while(n!=0);
	}

}
