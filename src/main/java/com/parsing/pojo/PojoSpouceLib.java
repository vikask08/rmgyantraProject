package com.parsing.pojo;

public class PojoSpouceLib {
    private String name;
    private String email;
    private int phone;
    
	public PojoSpouceLib(String name, String email, int phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
    
}
