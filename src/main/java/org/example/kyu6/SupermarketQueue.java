package org.example.kyu6;

import java.util.Arrays;

public class SupermarketQueue {
    public static int solveSuperMarketQueue(int[] customers, int n){
        if(customers.length == 0) return 0;

        int time = 0;
        int[] tills = new int[n];
        System.arraycopy(customers, 0, tills, 0, Math.min(tills.length, customers.length));
        int position = Math.min(tills.length, customers.length);

        while(Arrays.stream(tills).anyMatch(x -> x > 0) || position < customers.length){
            if(Arrays.stream(tills).anyMatch(x -> x == 0)){
                position = fill(tills, customers, position);
            }
            int min = Arrays.stream(tills).filter(x -> x > 0).min().getAsInt();
            tills = Arrays.stream(tills).map(x -> x -= min).toArray();
            time += min;
        }
        return time;
    }

    public static int fill (int[] tills, int[] customers, int position){
        for(int i = 0; i < tills.length; i++){
            if(tills[i] == 0 && position < customers.length) {
                tills[i] = customers[position];
                position++;
            }
        }
        return position;
    }

    public static int solveSuperMarketQueuee(int[] customers, int n) {
        int[] result = new int[n];
        for(int i = 0; i < customers.length; i++){
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[n-1];
    }

}

