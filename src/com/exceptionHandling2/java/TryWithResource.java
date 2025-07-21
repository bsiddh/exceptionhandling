package com.exceptionHandling2.java;

import java.io.*;
import java.util.*;

public class TryWithResource {
    public static void main(String[] args) {
        //here resource scanner class has been mentioned in try block
        //where catch block is not mandatory
//       try(Scanner rs = new Scanner(System.in)) {
//         System.out.println("Enter the number");
//         int num = rs.nextInt();
//         System.out.println("Entered the right block "+num);
//       }
        try(FileInputStream fu = new FileInputStream("abc.txt");Scanner s = new Scanner(System.in)) {
            System.out.println("hi boss");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //scanner --->closeable-->autocloseable
}
//try with resource is valid syntax without catch block
//for checked exception catch is mandatory and for uncehecked catch is optional
