package com.parsing.pojo;

public class EmployeeDetailsPojo {
	private String name;
	private String empID;
	private int phoneNo;
	private String email;
	
	public EmployeeDetailsPojo(String name, String empID, int phoneNo, String email) {
		super();
		this.name = name;
		this.empID = empID;
		this.phoneNo = phoneNo;
		this.email = email;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
