package com.StudentInformationSystem;

import java.util.List;

public class ExtraCurricular {

    private String activity;
    private String position;
    private String role;
    private List<String> achievements;

    public ExtraCurricular() {}

    public String getActivity() { return activity; }
    public void setActivity(String activity) { this.activity = activity; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public List<String> getAchievements() { return achievements; }
    public void setAchievements(List<String> achievements) { this.achievements = achievements; }
}
