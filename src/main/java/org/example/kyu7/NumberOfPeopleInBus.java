package org.example.kyu7;

import java.util.List;

public class NumberOfPeopleInBus {
    public static int ppl(List<int[]> stop){
        return stop.stream().mapToInt(x -> x[0] - x[1]).sum();
    }
}
