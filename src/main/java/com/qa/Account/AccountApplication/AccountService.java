package com.qa.Account.AccountApplication;

import java.util.HashMap;

public class AccountService {
	
	private HashMap<Long,Account> accounts = new HashMap<Long,Account>();
	
public void createAccount(Account a) {
	
	accounts.put(a.getID(), a);
}

public void updateAccount(long id, String newFirst, String newLast, String newNumber) {
	
	if(accounts.containsKey(id)) {
		
		Account b = accounts.get(id);
		b.setFirstName(newFirst);
		b.setLastName(newLast);
		b.setAccountNumber(newNumber);
		accounts.put(id, b);
	}
	
}

public void deleteAccount(long id) {
	
	accounts.remove(id);
}
}
