package com.Onlinelearningplatform;

import java.util.List;

public class Platform {

    private String platform;
    private List<Category> categories;

    public Platform() {}

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
