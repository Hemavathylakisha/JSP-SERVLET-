package com.Onlinelearningplatform;

import java.util.List;

public class Instructor {

    private String name;
    private String experience;
    private List<String> languages;

    public Instructor() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public List<String> getLanguages() { return languages; }
    public void setLanguages(List<String> languages) { this.languages = languages; }
}
