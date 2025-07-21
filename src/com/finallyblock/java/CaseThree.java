package com.finallyblock.java;

public class CaseThree {
    //Abnormal termination
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
             System.out.println(10/0);
        }
        finally {
            System.out.println("abnormal termination");
        }
    }
}
