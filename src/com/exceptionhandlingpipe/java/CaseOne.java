package com.exceptionhandlingpipe.java;

import java.util.*;

public class CaseOne {
//for unchecked exception
    public static void main(String[] args) {
        try {
            Scanner inputValue = new Scanner(System.in);
            System.out.println("enter the value :");
            int number = inputValue.nextInt();
            System.out.println(10/number);
            System.out.println("sidd".charAt(6));
        }
        catch (ArithmeticException | NumberFormatException ne){
         System.out.println("Exceptuion handled :"+ne);
        } catch (StringIndexOutOfBoundsException | ClassCastException | NullPointerException en) {
                 System.out.println("Exception handled in second block "+en);
        }
        System.out.println("rest of the app");
    }
}
