package org.example.kyu6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HighestScoreWord {
    public static String high(String str){
        String [] strings = str.split(" ");
        int[] result = Arrays.stream(strings).mapToInt(word -> word.chars().map(x -> x - 96).sum()).toArray();
        int max = Arrays.stream(result).max().getAsInt();
        int index = IntStream.of(result).boxed().collect(Collectors.toList()).indexOf(max);
        return strings[index];

//        return Arrays.stream(s.split(" "))
//                .max(Comparator.comparingInt(
//                        a -> a.chars().map(i -> i - 96).sum()
//                )).get();
    }
}
