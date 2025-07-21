package com.finallyblock.java;

public class CaseOne {

    public static void main(String[] args) {
       //Normal termination
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("not able to handle the exception");
        }finally {
            System.out.println("finally block excuited");
        }
    }
}
