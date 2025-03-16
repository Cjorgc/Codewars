package org.example;

import org.example.kyu6.*;
import org.example.kyu7.*;
import org.example.kyu8.*;
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
    @Test
    public void vowelCountTest(){
        int result = VowelCount.vowelCount("abracadabra");
        assertEquals(5, result);
    }
    @Test
    public void converterTest(){
        String result = ConvertABooleanToString.converter(false);
        assertEquals("false", result);
    }
    @Test
    public void dnaToRnaTest(){
        String result = DNAToRNA.dnaToRna("GCAT");
        assertEquals("GCAU", result);
    }
    @Test
    public void sumTest(){
        int result = SumWithoutHighestAndLowestNumber.sum(new int[] { 6, 0, 1, 10, 10});
        assertEquals(17, result);
    }
    @Test
    public void literTest(){
        int result = KeepHydrated.liters(2);
        assertEquals(1, result);
    }
    @Test
    public void tenMinWalkTest(){
        boolean result = TakeATenMinutesWalk.tenMinWalk(new char[] {'n','s','n','s','n','s','n','s','n','s'});

        assertTrue(result);
    }
    @Test
    public void growTest(){
        int result = ReduceButGrow.grow(new int[]{2,2,2,2,2,2});
        assertEquals(64, result);
    }
    @Test
    public void amountTest(){
        int result = TotalAmountOfPoints.points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"});
        assertEquals(30, result);
    }
    @Test
    public void encoderTEst(){
        String result = DuplicateEncoder.encoder("$$\\");
        assertEquals("))(", result);
    }
    @Test
    public void highesScoreWordTest(){
        String result = HighestScoreWord.high("b aa");
        assertEquals("b", result);
    }
    @Test
    public void oddOrEvenTest(){
        String result = OddOrEven.oddOrEven(new int[] {2, 5, 34, 6});
        assertEquals("odd", result);
    }
    @Test
    public void endsWithTest(){
        assertTrue(StringEndsWith.solution("samurai", "ai"));
    }
    @Test
    public void playingWithDigitsTest(){
        assertEquals(51, PlayingWithDigits.digPow(46288, 3));
    }
    @Test
    public void findNextSquareTest(){
        assertEquals(144, FindNextPerfectSquare.findNextSquare(121));
    }
    @Test
    public void fewfwe(){

    }
    //        999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//        4 --> 0 (because 4 is already a one-digit number)
    @Test
    public void persistengBuggerOk(){
        assertEquals(3,PersistentBugger.persistence(39L));
        assertEquals(4,PersistentBugger.persistence(999L));
        assertEquals(0,PersistentBugger.persistence(4L));
    }
    @Test
    public void yourOrderPleaseOk(){
        assertEquals("is2 Thi1s T4est 3a",  YourOrderPlease.order("Thi1s is2 3a T4est"));
    }
    @Test
    public void sentenceSmash(){
        assertEquals("hello world this is great", SentenceSmash.smash("hello", "world", "this", "is", "great"));
    }
    @Test
    public void stringRepeat(){
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
    }
    @Test
    public void countPositivesAndNegativesTest(){
        int[] expectedResult = new int[] {10, -65};
        assertArrayEquals(expectedResult, CountOfPositivesSumNegatives.countOfPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }
    @Test
    public void findStray(){
        assertEquals(2, FindTheStrayNumber.stray(new int[]{2, 1, 1}));
    }
    @Test
    public void binaryAdd(){
        assertEquals("10", BinaryAddition.binaryAddition(1, 1));
    }
    @Test
    public void friend(){
        assertEquals(List.of("Ryan", "Yous"), FriendsOrFoe.friend(List.of("Ryan", "Kieran", "Jason", "Yous")));
    }

    @Test
    public void remove(){
        int[] actual = RemoveTheMinimum.remove(new int[] {5, 3, 2, 1, 4});
        assertArrayEquals(new int[] {5, 3, 2, 4}, actual);
    }
    @Test
    public void people(){
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, NumberOfPeopleInBus.ppl(list));
    }
    @Test
    public void numbersToString() {
        assertEquals("1000000000 + 400000000 + 5000000 + 400000 + 60000 + 7000 + 600 + 70 + 4",WriteNumberInExpandedForm.expandedForm(1405467674));
    }

    @Test
    public void square(){
        assertEquals("negative numbers aren't square numbers", false, YoureSquare.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   YoureSquare.isSquare(0));
        assertEquals("3 isn't a square number", false,  YoureSquare.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   YoureSquare.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   YoureSquare.isSquare(25));
        assertEquals("26 isn't a square number",false,  YoureSquare.isSquare(26));
    }
    @Test
    public void findOdd(){
        assertEquals(4, FindOdd.findIt(new int[] {1,2,2,3,3,3,4,3,3,3,2,2,1}));
    }
    @Test
    public void queue(){
        assertEquals(9, SupermarketQueue.solveSuperMarketQueuee(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
        assertEquals(15, SupermarketQueue.solveSuperMarketQueuee(new int[] { 1, 2, 3, 4, 5 }, 1));
        assertEquals(0, SupermarketQueue.solveSuperMarketQueuee(new int[] {}, 1));
        assertEquals(113, SupermarketQueue.solveSuperMarketQueuee(new int[] {29, 18, 6, 23, 25, 29, 24, 17, 10, 8, 8, 22, 20, 16, 13, 17, 7, 21, 7, 11, 18, 26, 25, 1, 18, 29, 16, 26, 7, 11, 13, 20, 12, 6, 23, 3, 10, 9, 8, 5, 6, 18, 19, 26, 5, 15, 4, 15, 1, 4}, 7));
    }
    @Test
    public void camelCase(){
        assertEquals( "Incorrect", "camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }
}
