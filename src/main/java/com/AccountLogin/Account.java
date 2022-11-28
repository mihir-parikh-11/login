package com.AccountLogin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="account")
public class Account {
	
	@Id
	@Column(name="username", nullable = false)
	private String userName;
	
	@Column(name="accountholdername", nullable = false)
	private String accountHolderName;
	
	@Column(name="accountnumber", nullable = false)
	private long accountNumber;
	
	@Column(name="gender", nullable = false)
	private String gender;
	
	@Column(name="balance", nullable = false)
	private double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String userName, String accountHolderName, long accountNumber, String gender, double balance) {
		super();
		this.userName = userName;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.gender = gender;
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", accountHolderName=" + accountHolderName + ", accountNumber="
				+ accountNumber + ", gender=" + gender + ", balance=" + balance + "]";
	}
	
	
	

}
