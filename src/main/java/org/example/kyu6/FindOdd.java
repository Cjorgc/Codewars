package org.example.kyu6;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a){
        boolean isOdd;
        final int[] reduced = Arrays.stream(a).distinct().toArray();
        for (int i = 0; i < reduced.length; i++){
            int finalI = i;
            long counter = Arrays.stream(a).filter(x -> x == reduced[finalI]).count();
            isOdd = counter % 2 == 1;
            if(isOdd) return reduced[i];
        }
        return 0;
//        Tambien se puede resolver utilizando XOR
//        int xor = 0;
//        for (int i = 0; i < A.length; i++) {
//            xor ^= A[i];
//        }
    }
}
