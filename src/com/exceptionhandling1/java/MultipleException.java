package com.exceptionhandling1.java;

import java.util.Scanner;

public class MultipleException {

    public static void main(String[] args) {
//        try with multiple catch blocks

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the value");
            int num = scan.nextInt();
            System.out.print(10/num);
            System.out.print("ratan ".charAt(12));//won't be excuited

        }catch (ArithmeticException ae){
            System.out.println("ratan.com ");
        } catch (StringIndexOutOfBoundsException se) {
            System.out.print("strimg handled");
        }
        //as we can see rest of the statement didn't execuite once the arithmatic exception was raised.
        //simply it execuited the arithmatic statement.
        //it is always safe to use multiple catch block
        System.out.print("rest of application running successfully");
    }
}
