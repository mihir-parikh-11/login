package com.AccountLogin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

	@Autowired
	SessionFactory factory;

	@Autowired
	Account account;

	@Autowired
	LoginUser loginUser;

	@Autowired
	AccountService accountService;

	@GetMapping("AccountLogin")
	public String getLogInPage() {

		return "AccountLogIn";
	}

	@GetMapping("AccountCreate")
	public String getCreatePage() {
		
		return "createAccount";
		
	}

	@GetMapping("checklogedin")
	public ModelAndView getInsideLoginPage(String uname, String pass) {
		ModelAndView mv = new ModelAndView();

			Session session = factory.openSession();
			loginUser= session.get(LoginUser.class, uname);

			if (loginUser == null) {
				mv.addObject("UNAME", "Username not exist. Please enter valid Username.");
				mv.setViewName("AccountLogIn");

				return mv;
			} else {
				if (pass.equals(loginUser.getPassword())) {

					// LOG IN PAGE GO INSIDE

					Account account = accountService.getAccountDetails(uname);

					mv.addObject("data0", account);
					mv.addObject("data", "login succesfully");
					mv.setViewName("AccountLogIn");

					return mv;
				} else {

					mv.addObject("PASS", "Please enter correct Password.");
					mv.setViewName("AccountLogIn");

					return mv;
				}

			
		}

	}

	@GetMapping("addNewUserDetails")
	public ModelAndView addNewUserDetails(LoginUser loginUser2, Account account2, String password2,
			long accountNumber2) {
		ModelAndView mv = new ModelAndView();

		if (account2.getAccountNumber() == accountNumber2) {
			String userName = loginUser2.getuserName().toLowerCase();
			System.out.println(userName);

			if ((loginUser2.getuserName().equals(userName))) {
				Session session = factory.openSession();
				loginUser =session.get(LoginUser.class,loginUser2.getuserName());
					
				if(loginUser==null) {
					
					if(loginUser2.getPassword().equals(password2)) {
						Session session2= factory.openSession();
						
						Transaction transaction =session2.beginTransaction();
						session2.save(account2);
						session2.save(loginUser2);
						transaction.commit();
						
						mv.addObject("data1", "Account Created Successfully");
						mv.setViewName("AccountLogIn");

						return mv;
						
					}else {
						mv.addObject("Password", "Password doesn't match.");
						mv.setViewName("createAccount");
						return mv;
					}
					
				}else {
					mv.addObject("Username", "Username already exist.");
					mv.setViewName("createAccount");

					return mv;
				}
				
				
			}else {
				mv.addObject("Username", "Please enter a Username in lowercase.");
				mv.setViewName("createAccount");

				return mv;
			}
		} else {
			mv.addObject("accountNumber", "Account number doesn't match.");
			mv.setViewName("createAccount");
			return mv;
		}

	}

}
