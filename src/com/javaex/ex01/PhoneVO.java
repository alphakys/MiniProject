package com.javaex.ex01;

import java.util.ArrayList;

public class PhoneVO {
	private String name;
	private String hp;
	private String company;
	
	
	
	//////////////////////////////////////////////////////////
	
	
	
	public PhoneVO() {}
	
	public PhoneVO(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	
	///////////////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String gethp() {
		return hp;
	}
	public void sethp(String ph) {
		this.hp = hp;
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
		return name+"    "+hp+"    "+company;
	}

	
	//이름 검색을 위한 메서드
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((hp == null) ? 0 : hp.hashCode());
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
		PhoneVO other = (PhoneVO) obj;
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
		if (hp == null) {
			if (other.hp != null)
				return false;
		} else if (!hp.equals(other.hp))
			return false;
		return true;
	}
	
	
	
}
