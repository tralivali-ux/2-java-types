package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int z = x+y;
        String numberString = Integer.toString(Math.abs(z));
        char[] charArray = numberString.toCharArray();
        return charArray.length;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
