package org.example.kyu7;

import java.util.Arrays;
import java.util.List;


public class RemoveTheMinimum {
    public static int[] remove(int[] numbers){
        if(numbers.length == 0) return numbers;
        int toRemove = Arrays.stream(numbers).sorted().findFirst().getAsInt();
        List<Integer> newNumbers = new java.util.ArrayList<>(Arrays.stream(numbers).boxed().toList());
        newNumbers.remove(Integer.valueOf(toRemove));

        return newNumbers.stream().mapToInt(i -> i).toArray();
    }
}
