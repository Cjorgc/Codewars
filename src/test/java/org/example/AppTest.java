package org.example;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void reverseArray(){
        int [] result = ReverseArraysOfDigits.digitize(35231);
        int [] expected = {1,3,2,5,3};
        assertArrayEquals(result, expected);
    }

    @Test
    public void summationTest(){
        int result = Summation.summation(8);
        int expected = 36;

        assertEquals(result, expected);
    }

    @Test
    public void BMITest(){
        String result = BMI.calculateBMI(80, 1.80);

        assertEquals(result, "Normal");
    }

    @Test
    public void checkTest(){
        boolean result = OnlyNeedOne.check(new Object[] {66, 101}, 66);

        assertTrue(result);
    }

    @Test
    public void reverseWordsTest(){
        String result = ReverseWords.reverseWords("elbuod  decaps  sdrow");
        System.out.println(result);

        assertEquals(result,"double  spaced  words");
    }
}

//    $ curl -H "Authorization: token OAUTH-TOKEN" https://api.github.com/users/codertocat -I HTTP/2 200 X-Accepted-OAuth-Scopes: Cjorgc
