package org.example.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReduceButGrow {
    public static int grow(int[] x){
//        return Arrays.stream(x).reduce(1,(a,b) -> a * b);
        return IntStream.of(x).reduce(1, (a, b) -> a * b);
    }
}
