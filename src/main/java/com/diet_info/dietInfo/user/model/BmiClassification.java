package com.diet_info.dietInfo.user.model;

public enum BmiClassification {
    UNDERWEIGHT("Underweight"),
    NORMAL("Normal"),
    OVERWEIGHT("Overweight"),
    OBESE1("Obesity - First class"),
    OBESE2("Obesity - Second class"),
    EXTREMEOBESITY("Extreme obesity");

    private final String classification;

    BmiClassification(String classification) {
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }
}
