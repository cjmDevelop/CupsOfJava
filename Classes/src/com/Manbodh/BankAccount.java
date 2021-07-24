package com.Manbodh;

public class BankAccount {

	private int accountNumber;
	private int balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
		System.out.println(balance);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSmail() {
		return email;
	}

	public void setSmail(String smail) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void deposit(int depositValue) {

		this.balance += depositValue;

		System.out.println(balance);
	}

	public void withdrawl(int withdrawlAmount) {

		this.balance -= withdrawlAmount;

		if (withdrawlAmount > balance) {
			System.out.println(" Insufficient Funds cannot process withdrawal ");
		} else {
			System.out.println(balance);
		}

	}

}
