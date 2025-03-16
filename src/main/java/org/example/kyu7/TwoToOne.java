package org.example.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest(String a, String b){
        return Arrays.stream((a+b).split("")).sorted().distinct().collect(Collectors.joining());
    }
}
