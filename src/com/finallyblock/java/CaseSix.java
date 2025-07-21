package com.finallyblock.java;

public class CaseSix {
    public static void main(String[] args) {
        System.out.println(10/0);
        try {
            System.out.println("try");

        }finally {
            System.out.println("finally block");
        }
    }
    //in this example the controller haven't entered the try block due to which finally block won't be execuiting
    //controller will execuite very first line will raise an uncheked exception i.e is arithmatic exception.
}
