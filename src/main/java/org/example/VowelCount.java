package org.example;

public class VowelCount {
    public static int vowelCount(String str){
        return str.replaceAll("[^aeiou]", "").length();
    }
}
