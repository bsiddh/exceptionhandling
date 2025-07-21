package com.finallyblock.java;

public class CaseFour {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println(10/0);
        }
        finally {
            System.out.println(10/0);
            System.out.println("Abnormal termination");
        }
    }
    //here the termiantion is abnormal since even in finally block not able to handle the exception
}
