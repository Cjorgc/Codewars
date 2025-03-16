package org.example.kyu7;

public class ExesAndOhs {
    public static boolean getXO(String str){
        return str.replaceAll("(?i)o", "").length() == str.replaceAll("(?i)x", "").length();
    }
}
