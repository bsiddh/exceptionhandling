package com.exceptionhandling1.java;

public class Example5 {

    public static void main(String[] args) {
        try {
            System.out.print(10/0);
            System.out.print("ratan");
            System.out.print("sai");
        } catch (ArithmeticException e) {
            System.out.print(10/2);
        }
        System.out.print("rest of the application...");
    }
}
//as above example we can see once in try block if the exception is raised.
//rest of statement won't be execuited inside try block
//only the catch block will be execuited.