package com.exceptionhandling1.java;

public class Example1 {

    public static void main(String[] args) {
        System.out.print("ratan world");
        System.out.print(10/0);//here exception has been raised
        System.out.print("rest of the app");
    }
}
//In the given example exception has been raised due to arithmatic exception
//which causes termination of rest of the applications
//once in between exception raised rest of the application terminated immidiately