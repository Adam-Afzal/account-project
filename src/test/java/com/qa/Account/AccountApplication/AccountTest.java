package com.qa.Account.AccountApplication;
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.qa.accounts.Account;
import com.qa.service.AccountService;

public class AccountTest {

	@Test
	public void addAccountTest() {
		
		Account testAccount = new Account(0122,"Adam","Afzal","1234");
		AccountService testAS = new AccountService();
		testAS.addAccount(testAccount);
		HashMap<Long,Account> testHashMap = testAS.getAccounts();
		
		assertEquals(1,testHashMap.size());
		
	
	}
	
	@Test
	public void removeAccountTest() {
		

		Account testAccount = new Account(0122,"Adam","Afzal","1234");
		AccountService testAS = new AccountService();
		testAS.addAccount(testAccount);
		
	testAS.deleteAccount(0122);
	HashMap<Long,Account> testHashMap = testAS.getAccounts();
	
	assertEquals(0,testHashMap.size());
	
	
	

	
	}
	
	
	@Test
	public void updateAccountTest() {
		Account testAccount = new Account(0122,"Adam","Afzal","1234");
		AccountService testAS = new AccountService();
		testAS.addAccount(testAccount);
		testAS.updateAccount(0122, "Bruce", "Wayne", "976");
		Account updatedTest=  testAS.findAccount(0122);
		assertEquals("Wayne",updatedTest.getLastName());
		
		
		
	
	

	
	}
	
	
	@Test
	public void countSimilarNamesTest() {
		Account testAccount1 = new Account(0122,"Adam","Afzal","12341");
	}
}
