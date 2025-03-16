package org.example.kyu6;

import java.util.Arrays;

public class DuplicateEncoder {
    public static String encoder(String word){
        String result = "";
        for(int i = 0 ; i < word.length(); i ++){
            result += word.replaceAll("(?i)[^" + getChar(word.charAt(i)) + "]","").length() > 1 ? ")" : "(";
        }
        return result;

//        return word.toLowerCase()
//                .chars()
//                .mapToObj(i -> String.valueOf((char)i))
//                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
//                .collect(Collectors.joining());
    }
    private static String getChar(char str){
        if(!(str == '\\')){
            return String.valueOf(str);
        }
        else {
            return "\\\\";
        }
    }
}
