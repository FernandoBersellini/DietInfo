package com.diet_info.dietInfo.user.model;

import lombok.Data;

import java.text.DecimalFormat;

@Data
public class UserDTO {
    private String username;
    private String password;
    private double bmi;
    private String bmiClassification;

    public UserDTO(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.bmi = calculateBmi(user.getWeight(), user.getHeight());
        this.bmiClassification = bmiClassification(bmi);
    }

    public double calculateBmi(double weight, double height) {
        DecimalFormat formatter = new DecimalFormat("#,##");

        return Double.parseDouble(formatter.format(weight / Math.pow(height, 2)));
    }

    public String bmiClassification(double bmi) {
        if (bmi < 18.5) {
            return BmiClassification.UNDERWEIGHT.getClassification();
        } else if (bmi < 25) {
            return BmiClassification.NORMAL.getClassification();
        } else if (bmi < 30) {
            return BmiClassification.OVERWEIGHT.getClassification();
        } else if (bmi < 35) {
            return BmiClassification.OBESE1.getClassification();
        } else if (bmi < 40) {
            return BmiClassification.OBESE2.getClassification();
        } else {
            return BmiClassification.EXTREMEOBESITY.getClassification();
        }
    }
}
