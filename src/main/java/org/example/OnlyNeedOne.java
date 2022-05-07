package org.example;

import java.util.Arrays;

public class OnlyNeedOne {
    public static boolean check(Object[] a, Object x){
        return Arrays.stream(a).filter(obj -> obj.equals(x)).findFirst().isPresent();
    }
}
