package com.exceptionhandling1.java;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.print(10/0);
        } catch (ArithmeticException ae) {
            System.out.print(10/2);
            System.out.print(" ");
        }
        System.out.print("Exception handled");
    }
}

//catch (ArithmeticException ae) {
//        System.out.print(10/2);
//            System.out.print(" ");
//        }

//in the above catch exception won't be checked since
// it is null pointer exception as we are facing arithmatic exception.