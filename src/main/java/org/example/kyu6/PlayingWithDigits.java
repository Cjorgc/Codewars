package org.example.kyu6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class PlayingWithDigits {
    public static int digPow(int n, int p){
        String digits = String.valueOf(n);
        int result = 0;
        for(int i = 0 ; i < digits.length(); i ++, p++){
            String[] digit = digits.split("");
            result += Math.pow(Double.valueOf(digit[i]), p);
        }
        return (result % n) == 0 ? result / n : -1;

//        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
//        int sum = IntStream.range(0, digits.length).map(i -> (int) Math.pow(digits[i], i + p)).sum();
//        return sum % n == 0 ? sum / n : -1;
    }
}
