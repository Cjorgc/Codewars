package org.example.kyu7;

public class FindNextPerfectSquare {
    public static long findNextSquare(long sq){
        Double sqrt = Math.sqrt(sq);
        return Math.floor(Math.sqrt(sq)) - sqrt == 0 ? (long) Math.pow(sqrt + 1, 2) : -1  ;
    }
}
