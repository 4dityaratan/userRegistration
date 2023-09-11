package com.okayjava.html.model;

public class User {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	private String mobileNo;


	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", mobileNo='" + mobileNo + '\'' +
				'}';
	}
}
