package org.example.kyu8;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class SumArrays {
    public static double sum (double[] numbers){
        return (numbers == null || numbers.length == 0) ? 0 : DoubleStream.of(numbers).sum();
    }
}
