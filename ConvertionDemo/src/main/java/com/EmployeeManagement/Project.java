package com.EmployeeManagement;

import java.util.List;

public class Project {
	private String projectId;
    private String title;
    private int durationMonths;
    private List<TeamMember> team;

    public Project() {}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDurationMonths() {
		return durationMonths;
	}

	public void setDurationMonths(int durationMonths) {
		this.durationMonths = durationMonths;
	}

	public List<TeamMember> getTeam() {
		return team;
	}

	public void setTeam(List<TeamMember> team) {
		this.team = team;
	}
    
    
}

