package com.parsing.pojo;

public class PojoArryLibrary {
	private String name;
	private String empId;
	private String email;
	private long[] phnNo;
	
	public PojoArryLibrary() {
		
	}
	public PojoArryLibrary(String name, String empId, String email, long[] phnNo) {
		super();
		this.name = name;
		this.empId = empId;
		this.email = email;
		this.phnNo = phnNo;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long[] getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(long[] phnNo) {
		this.phnNo = phnNo;
	}

}
