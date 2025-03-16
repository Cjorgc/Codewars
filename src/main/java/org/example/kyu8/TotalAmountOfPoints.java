package org.example.kyu8;

public class TotalAmountOfPoints {
    public static int points(String[] games){
        int result = 0;
        for(String e : games){
            String x = e.split(":")[0];
            String y = e.split(":")[1];
            int scoreX = Integer.valueOf(x);
            int scoreY = Integer.valueOf(y);
            if(scoreX > scoreY) result += 3;
            if(scoreX == scoreY) result += 1;
        }
        return result;
    }
}
