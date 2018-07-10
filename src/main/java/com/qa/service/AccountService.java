package com.qa.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

import com.qa.accounts.Account;
import com.qa.constants.Constants;

public class AccountService {
	
	private HashMap<Long,Account> accounts = new HashMap<Long,Account>();
	
public void createAccount(Account a) {
	
	accounts.put(a.getID(), a);
}

public void updateAccount(long id, String newFirst, String newLast, String newNumber) {
	
	if(this.accounts.containsKey(id)) {
		
		Account b = accounts.get(id);
		b.setFirstName(newFirst);
		b.setLastName(newLast);
		b.setAccountNumber(newNumber);
		accounts.put(id, b);
	} else {
		
	System.out.println(Constants.ERROR_MESSAGE);
	}
	
}

public void deleteAccount(long id) {
	
	accounts.remove(id);
}
public void addAccount(Account a) {
	
	this.accounts.put(a.getID(), a);
}
public HashMap<Long,Account> getAccounts(){
	
	return this.accounts;
}
public Account findAccount(long id) {
	Account a = new Account(0000,"","","");
	
	if(this.accounts.containsKey(id)) {
		
	return this.accounts.get(id);
			
	
	}
	
	return a;
	
	
	
	
}

public int getNameCount(String Name) {
	
//	int count = 0;
//	
//	for (Map.Entry<Long, Account> entry : this.accounts.entrySet()) {
//	    if(entry.getValue().getFirstName().equals(Name)) {
//	    	count ++;
//	    }
//	}
//	return count;
	
	
	
	return (int) this.accounts.values().stream().filter(s -> s.getFirstName().equals(Name)).count();
}

}
