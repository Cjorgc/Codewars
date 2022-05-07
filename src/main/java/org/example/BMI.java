package org.example;

public class BMI {
    public static String calculateBMI(double weight, double height){
        double bmi = weight / Math.pow(height, 2);
        if(bmi <= 18.5D)  return "Underwight";
        if(bmi <= 25.0D)  return "Normal";
        if(bmi <= 30.0D)  return "Overwight";
        else return "Obese";

    }
}
