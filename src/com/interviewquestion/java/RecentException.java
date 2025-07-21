package com.interviewquestion.java;

public class RecentException {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
        System.out.println("sai".charAt(6));
        }
        finally {
            int[] arrayElement = {7,4,8};
            System.out.println(arrayElement[7]);
        }
    }
    //here most recent exception or statement would be raised
    //since finally block execuites at last hence the last statement will always execuited
}
