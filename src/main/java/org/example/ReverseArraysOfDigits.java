package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArraysOfDigits {
    public static int[] digitize(long n) {
        List<Integer> reverse = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
        Collections.reverse(reverse);
        return reverse.stream().mapToInt(Integer::valueOf).toArray();
    }
}
