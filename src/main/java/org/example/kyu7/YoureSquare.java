package org.example.kyu7;

public class YoureSquare {
    public static boolean isSquare(int n){
        int i = (int) Math.sqrt(n);
        return i * i == n;
    }
}
