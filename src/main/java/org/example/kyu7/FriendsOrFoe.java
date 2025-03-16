package org.example.kyu7;

import java.util.List;

public class FriendsOrFoe {
    public static List<String> friend(List<String> x){
        return x.stream().filter(elem -> elem.length() == 4).toList();
    }
}
