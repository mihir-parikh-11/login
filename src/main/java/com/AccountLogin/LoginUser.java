package com.AccountLogin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="login")
public class LoginUser {
	
	@Id
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginUser [userName=" + userName + ", password=" + password + "]";
	}
	

}
