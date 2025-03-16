package org.example.kyu7;

import java.util.Arrays;

public class FindTheStrayNumber {
    public static int stray(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length - 1] : numbers[0];
    }
}
