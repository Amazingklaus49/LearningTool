package com.example.learning_tool;

public class Translation {
    private String english;
    private String german;
    private String solution;

    public Translation(String english, String german, String solution) {
        this.english = english;
        this.german = german;
        this.solution = solution;
    }

    public String getEnglish() {
        return english;
    }

    public String getGerman() {
        return german;
    }

    public String getSolution() {
        return solution;
    }
}
