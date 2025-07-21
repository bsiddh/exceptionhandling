package com.exceptionhandlingpipe.java;

import java.io.*;

public class CaseTwo {

    public static void main(String[] args) {
        try {
                        Thread.sleep(1000);
                        FileInputStream fis = new FileInputStream("abc.text");
        } catch (InterruptedException| FileNotFoundException fe) {
            System.out.println("Sai "+fe);
        }
        //case 4
        //can mix both but checked must be in try block
        //Arithmatic exception should be optional (unchecked exception)
//        catch (InterruptedException| ArithmaticException fe) {
//            System.out.println("Sai "+fe);
//        }
        System.out.println("rest of the applicatioion");
    }
    //Exception 'java.io.FileNotFoundException' is never thrown in the corresponding try block
}
