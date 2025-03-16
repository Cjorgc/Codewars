package org.example.kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers){
        if(numbers.length == 0) return 0;
        Arrays.stream(numbers).forEach(System.out::println);
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        System.out.println("min : " + min);
        System.out.println("max : " + max);

        list.remove(min);
        list.remove(max);

        list.stream().forEach(System.out::println);

        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static int best(int[] numbers){
        return (numbers == null || numbers.length == 0 || numbers.length == 1 ) ? 0 : IntStream.of(numbers).sum() - IntStream.of(numbers).max().getAsInt() - IntStream.of(numbers).min().getAsInt();
    }
}
