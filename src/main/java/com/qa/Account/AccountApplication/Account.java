package com.qa.Account.AccountApplication;

public class Account {
	
	private String firstName, lastName, accountNumber;
	private long id;
	

	public Account(long id, String firstName, String lastName, String accountNumber) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.id = id;
	}
public long getID() {
	return this.id;
}

public void setID(long id) {
	this.id = id;
	
}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
	

}
