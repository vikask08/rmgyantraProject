package com.rmgyantra.pojoLib;

public class PojoLibForProjectCre {
	private String projectName;
	private String createdBy;
	private String status;
	private int teamSize;
	
	
	public void DatePojoLib (String projectName, String createdBy, String status, int teamSize) {
		
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.status = status;
		this.teamSize = teamSize;
		
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}	
}
