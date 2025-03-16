package org.example.kyu8;

import java.util.Arrays;

public class SentenceSmash {
    public static String smash(String... words){
        return Arrays.stream(words).reduce((a,b)->a+" " +b).orElse("");
    }
}
