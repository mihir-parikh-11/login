package com.AccountLogin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {
	
	@Autowired
	SessionFactory factory;
	
	public Account getAccountDetails(String uname) {
		
		Session session =factory.openSession();
		
		Account account =session.get(Account.class, uname);
		
		return account;
	}

}
