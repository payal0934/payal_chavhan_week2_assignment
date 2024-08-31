package com.xenosis.week2;

public class MainClass {
	
	  public static void main(String[] args) {
	     
	    	Person person = new Person("Payal", 30);
	        person.toString();

	        BankAccount account = new BankAccount(1000);
	        account.displayBalance();
	        account.deposit(500);
	        account.displayBalance();
	        account.withdraw(200);
	        account.displayBalance();
	        account.withdraw(1500);
	    	
	    }
	}

