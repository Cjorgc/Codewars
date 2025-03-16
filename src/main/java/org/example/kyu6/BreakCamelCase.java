package org.example.kyu6;

public class BreakCamelCase {
    public static String camelCase(String str) {
        if(str == null || str.isEmpty()) return "";
        return str.replaceAll("([a-z])([A-Z])", "$1 $2");
    }
}
