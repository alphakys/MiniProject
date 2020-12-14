package com.javaex.ex01;

import java.util.ArrayList;

public class PhoneDB {
	private String name;
	private String ph;
	private String company;
	
	
	
	//////////////////////////////////////////////////////////
	
	
	
	public PhoneDB() {}
	
	public PhoneDB(String name, String ph, String company) {
		this.name = name;
		this.ph = ph;
		this.company = company;
	}
	
	
	///////////////////////////////////////////////////////////
	
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

	
	//////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "PhoneDB [name=" + name + ", ph=" + ph + ", company=" + company + "]";
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ph == null) ? 0 : ph.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneDB other = (PhoneDB) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ph == null) {
			if (other.ph != null)
				return false;
		} else if (!ph.equals(other.ph))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
