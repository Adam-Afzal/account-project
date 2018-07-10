package com.qa.Account.AccountApplication;

import org.json.JSONObject;


import com.qa.accounts.Account;
import com.qa.service.AccountService;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	

    	Account testAccount = new Account(0122,"Adam","Afzal","1234");
		AccountService testAS = new AccountService();
		testAS.addAccount(testAccount);
		JSONObject json = new JSONObject(testAS.getAccounts());
		System.out.println(json);
		XStream xStream = new XStream(new DomDriver());
		
		System.out.println(xStream.toXML(testAccount));

    }
}
