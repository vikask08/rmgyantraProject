package com.parsing.pojo;

public class PojoLibrary {
	public String name;
	public String empId;
	public String emailId;
	public int phoneNo;

	public PojoLibrary() {
		// TODO Auto-generated constructor stub
	}
	public  PojoLibrary(String name, String empId, String emailId, int phoneNo ) {
		this.name = name;
		this.empId = empId;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}	
}
