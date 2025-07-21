package com.nestedtrycatch.java;

import java.util.Scanner;

public class CaseOne {

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
       System.out.println("Enter the value");
       int integerValue = inputValue.nextInt();

        try {
              System.out.println(10/integerValue);
            try{
               System.out.println("sidd".charAt(6));
            } catch (StringIndexOutOfBoundsException se) {
                System.out.println("Inner exception handled");
            }

        }
        catch (ArithmeticException ae){
              System.out.println("Arithmatic exception handled");
        }
        finally {
          System.out.println("Finally block execuited");
        }
        System.out.println("Rest of the application");
    }
    //here if the arithmatic exception raised the outer catch block will execuite
    //and very next statement won't be execuiting
    //if arithmatic exception won't raised then the string exception will be raised
    //in both cases finally block will be execuited
}
