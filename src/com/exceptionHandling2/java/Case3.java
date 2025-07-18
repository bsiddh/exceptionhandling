package com.exceptionHandling2.java;

import java.util.Scanner;

public class Case3 {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the value");
            int num = scan.nextInt();
            System.out.print(10/num);
            System.out.print("ratan ".charAt(12));
        }
        //child to parent
        catch (ArithmeticException ae) {
           System.out.print("Arithmatic exception handled");
        } catch (Exception e) {
           System.out.print("Other exception handled");
        }
    }
}
