package com.login.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class Login {

	public String usr;
	public String pwd;
	
	public Login()
	{
		
	}
	
	//getter and setter methods

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//Login Credentials
	
	public void SuccessLogin()
	{
		if(usr.equals("Admin") && pwd.equals("Admin"))
		{
			System.out.println("Logged in Successfully");
		}
		
		else
		{
			System.out.println("Verify Username or Password");
		}
	}
}
