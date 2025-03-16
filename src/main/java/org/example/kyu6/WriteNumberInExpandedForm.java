package org.example.kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WriteNumberInExpandedForm {
    public static String expandedForm(int number) {
        int digitsLeft = String.valueOf(number).length() - 1;
        int factor;
        List<String> word = new ArrayList<>();

        while(digitsLeft >= 0) {
            factor = (int) Math.pow(10, digitsLeft);
            if(number / factor > 0){
                word.add(String.valueOf(number / factor) + "0".repeat(digitsLeft));
            }
            number = number % factor;
            digitsLeft--;
        }

        return String.join(" + ", word);
    }
}
