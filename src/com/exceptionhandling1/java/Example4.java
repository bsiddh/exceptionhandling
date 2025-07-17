package com.exceptionhandling1.java;

public class Example4 {

    public static void main(String[] args) {
        try{
          System.out.print(10/0);
        } catch (Exception e) {
           System.out.print(10/0);
        }
        System.out.print("rest of the app");
    }
}
