package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String numberString = Integer.toString(x);
        char[] charArray = numberString.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++)
            intArray[i] = Character.getNumericValue(charArray[i]);
        for (int el : intArray) {
            if (el % 2 == 1)
                return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }
}
