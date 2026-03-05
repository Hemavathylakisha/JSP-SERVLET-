package com.ResearchProject;

import java.util.List;

public class ResearchProject {

    private String projectId;
    private String title;
    private PrincipalInvestigator principalInvestigator;
    private List<TeamMember> teamMembers;
    private Funding funding;
    private List<Milestone> milestones;
    private List<Publication> publications;
    private String status;

    public ResearchProject() {}

    public String getProjectId() { return projectId; }
    public void setProjectId(String projectId) { this.projectId = projectId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public PrincipalInvestigator getPrincipalInvestigator() { return principalInvestigator; }
    public void setPrincipalInvestigator(PrincipalInvestigator principalInvestigator) { this.principalInvestigator = principalInvestigator; }

    public List<TeamMember> getTeamMembers() { return teamMembers; }
    public void setTeamMembers(List<TeamMember> teamMembers) { this.teamMembers = teamMembers; }

    public Funding getFunding() { return funding; }
    public void setFunding(Funding funding) { this.funding = funding; }

    public List<Milestone> getMilestones() { return milestones; }
    public void setMilestones(List<Milestone> milestones) { this.milestones = milestones; }

    public List<Publication> getPublications() { return publications; }
    public void setPublications(List<Publication> publications) { this.publications = publications; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
