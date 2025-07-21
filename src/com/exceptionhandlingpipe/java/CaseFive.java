//package com.exceptionhandlingpipe.java;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class CaseFive {
//
//    public static void main(String[] args) {
//        here parent and child type exception can't be in catch block
//        try {
//            FileInputStream fs = new FileInputStream("abc.txt")
//        }
//        catch (IOException | FileNotFoundException ef){
//               System.out.println("sai "+ef);
//        }
//        System.out.println("rest of the application");
//    }
//}
