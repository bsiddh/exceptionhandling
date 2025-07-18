package com.exceptionHandling2.java;

import java.util.Scanner;

public class SingleCatchBlock {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the value");
            int num = scan.nextInt();
            System.out.print(10/num);
            System.out.print("ratan ".charAt(12));
        } catch (Exception e) {
            System.out.print("values updated");
        }
        //within above catch block all the exception handled.
    }
}
