package com.javaex.ex01;

public class PhoneDB {
	private String name;
	private String ph;
	private String company;
	
	public PhoneDB() {}
	
	public PhoneDB(String name, String ph, String company) {
		this.name = name;
		this.ph = ph;
		this.company = company;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	
	
	
}
