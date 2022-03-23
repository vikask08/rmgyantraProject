package com.parsing.pojo;

public class PojoLib {
	public String createdBy;
	public String projectName;
	public String status;
	public int teamSize;

	
	public  PojoLib(String createdBy, String projectName, String status, int teamSize ) {
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getTeamSize() {
		return teamSize;
	}
	public void setPhoneNo(int teamSize) {
		this.teamSize = teamSize;
	}

}
