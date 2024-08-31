package com.xenosis.week2;

 class Person {
	 String Name;
	 int Age;
	 
	 
	 

	public Person(String Name, int Age) {
		super();
		this.Name = Name;
		this.Age = Age;
	}

 }
	class BankAccount {
	    private double balance;

	   public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }
	    
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Current balance: " + balance);
	    }
	
}
