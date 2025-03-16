package org.example.kyu7;

public class BinaryAddition {
    public static String binaryAddition(int a, int b) {
//        StringBuilder sb = new StringBuilder();
//
//        int result = a + b;
//
//        while (result > 0) {
//            sb.append(result % 2);
//            result /= 2;
//        }
//        return sb.reverse().toString();

        return Integer.toBinaryString(a+b);
    }
}
