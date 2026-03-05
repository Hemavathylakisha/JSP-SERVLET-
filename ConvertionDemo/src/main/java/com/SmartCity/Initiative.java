package com.SmartCity;

import java.util.List;

public class Initiative {

    private String project;
    private String status;
    private double budget;
    private List<String> stakeholders;
    private List<String> technologies;
    private List<Phase> phases;

    public Initiative() {}

    public String getProject() { return project; }
    public void setProject(String project) { this.project = project; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }

    public List<String> getStakeholders() { return stakeholders; }
    public void setStakeholders(List<String> stakeholders) { this.stakeholders = stakeholders; }

    public List<String> getTechnologies() { return technologies; }
    public void setTechnologies(List<String> technologies) { this.technologies = technologies; }

    public List<Phase> getPhases() { return phases; }
    public void setPhases(List<Phase> phases) { this.phases = phases; }
}
