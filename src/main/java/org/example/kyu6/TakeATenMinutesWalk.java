package org.example.kyu6;

import java.util.HashMap;
import java.util.Map;

public class TakeATenMinutesWalk {
    public static boolean tenMinWalk(char[] walk){
        String walker = new String(walk);
        return walker.replaceAll("[^n]", "").length() == walker.replaceAll("[^s]", "").length()
                && walker.replaceAll("[^w]", "").length() == walker.replaceAll("[^e]", "").length();
    }
}
