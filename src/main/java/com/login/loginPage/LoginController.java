package com.login.loginPage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.AccountLogin.Account;
import com.AccountLogin.LoginUser;


@Controller
public class LoginController {

	@Autowired
	SessionFactory factory;

	@GetMapping("loginpage")
	public String logInPage() {
		return "LogInPage2";
	}

	@GetMapping("signuppage")
	public String signUpPage() {
		return "account";
	}

	@GetMapping("checklogin")
	public ModelAndView togetDetails(String uname, String pass) {
		ModelAndView mv = new ModelAndView();

		Session session = factory.openSession();
		User user = session.get(User.class, uname);

		if (user == null) {
			mv.addObject("data1", "Please Enter Valid User-name");
			mv.setViewName("LogInPage2");
			return mv;
		} else {
			if (pass.equals(user.password)) {
				mv.addObject("data", "Log in Successfully");
				mv.setViewName("logedIn");
				return mv;
			} else {
				mv.addObject("data1", "Please Enter Valid password");
				mv.setViewName("LogInPage2");
				return mv;
			}

		}

	}

	@GetMapping("addnewaccount")
	public ModelAndView toaddnewData(String fullname, String mail, String uname, String pass, String pass2, int age) {

		ModelAndView mv = new ModelAndView();
		
		Session session = factory.openSession();
		User user = session.get(User.class, uname);
		session.close();
		if (user != null) {
			mv.setViewName("account");
			mv.addObject("data1", "User Name Already exist.");
			return mv;
		} else {
			if (pass.equals(pass2)) {

				Session session2 = factory.openSession();
				Transaction tran = session2.beginTransaction();
				User user2 = new User(uname, pass, fullname, mail, age);
				session2.save(user2);
				tran.commit();

				mv.setViewName("dataadded");
				mv.addObject("data1", "Data Added SuccesFully.");

				return mv;
			} else {
				mv.setViewName("account");
				mv.addObject("data1", "Both password Doesn't match.");
				return mv;

			}
		}

	}

}
