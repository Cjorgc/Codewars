package org.example.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DoubleElementArray {
    public static int[] doubleElement (int[] numbers){
        return Arrays.stream(numbers).map(x -> x * 2).toArray();
    }
}
