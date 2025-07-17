package com.exceptionhandling1.java;

public class Example3 {
    public static void main(String[] args) {
//        try {
//            System.out.print("values not found");
//        }
//        try {
//            System.out.print("Values updated");
//        }
//        System.out.print("Incomplete values"); //statement between the try-catch block is invalid
//
//        catch (Exception e) {
//                System.out.print(10/2);
//        }

        //abnormal termination even catch block fails
        try {
            System.out.print(10/0);
        } catch (Exception e) {
            System.out.print(10/0);
        }
        System.out.print("catch is mandatory");

    }
}
//in this example an compile time exception will be raised
//since catch block is mandatory.
//only try blocks not allowed.