package com.parsing.pojo;

public class CompanyPojo {

	private String companyname;
	private int employeCount;
	private String companyDomain;
	public Object a;
	
	public Object getA() {
		return a;
	}
	public void setA(Object a) {
		this.a = a;
	}
	public CompanyPojo(String companyname, int employeCount, String companyDomain, Object[] a) {
		super();
		this.companyname = companyname;
		this.employeCount = employeCount;
		this.companyDomain = companyDomain;
		this.a=a;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getEmployeCount() {
		return employeCount;
	}
	public void setEmployeCount(int employeCount) {
		this.employeCount = employeCount;
	}
	public String getCompanyDomain() {
		return companyDomain;
	}
	public void setCompanyDomain(String companyDomain) {
		this.companyDomain = companyDomain;
	}
	

}
