package com.parsing.pojo;

public class PojoDetailsWithSpouce {
	private String name;
	private String empId;

	private String email;
	private int mobno;
	public Object spouce;
	public PojoDetailsWithSpouce(String name, String empId, String email, int mobno, Object spouce) {
		super();
		this.name = name;
		this.empId = empId;
		this.email = email;
		this.mobno = mobno;
		this.spouce = spouce;
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
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public Object getSpouce() {
		return spouce;
	}
	public void setSpouce(Object spouce) {
		this.spouce = spouce;
	}

}
