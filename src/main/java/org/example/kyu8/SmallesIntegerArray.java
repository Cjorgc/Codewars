package org.example.kyu8;

import java.util.Arrays;

public class SmallesIntegerArray {
    public static int findSmall(int[] args){
        return Arrays.stream(args).min().getAsInt();
    }
}
