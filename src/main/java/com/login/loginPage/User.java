package com.login.loginPage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@Column(nullable = false)
	String username;
	@Column(nullable = false)
	String password;
	@Column(nullable = false)
	String fullName;
	@Column(nullable = false)
	String mail;
	@Column(nullable = false)
	int age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String fullName, String mail, int age) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.mail = mail;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "CreateAccount [username=" + username + ", password=" + password + ", fullName=" + fullName + ", mail="
				+ mail + ", age=" + age + "]";
	}
	
	

}
