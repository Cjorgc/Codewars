package org.example.kyu8;

import java.util.Arrays;

public class CountOfPositivesSumNegatives {
    public static int[] countOfPositivesSumNegatives(int[] input) {
        if(input == null || input.length == 0) return new int[0];
        int positives = (int) Arrays.stream(input).filter(x -> x > 0).count();
        int negatives = Arrays.stream(input).filter(x -> x < 0).sum();
        return new int[]{positives, negatives};
    }
}
