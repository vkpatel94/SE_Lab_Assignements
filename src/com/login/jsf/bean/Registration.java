package com.login.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class Registration {
	
	public String  fname;
	public String  lname;
	public String  address;
	public String  pnumber;
	public String  email;
	public String  usr;
	public String  pwd;
	
		public Registration()
		{
			
		}
		
		//getters and setters methods

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPnumber() {
			return pnumber;
		}

		public void setPnumber(String pnumber) {
			this.pnumber = pnumber;
		}

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
		
		
	

}
