package com.throwskeywords.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CaseThree {

    void m1() throws InterruptedException, FileNotFoundException {
        Thread.sleep(1000);
        FileInputStream fis = new FileInputStream("abc.text");
    }
    void m2() throws InterruptedException{

        try{
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        CaseThree ct = new CaseThree();
//        try {
//            ct.m2();
//
//        } catch (InterruptedException ie) {
//            ie.printStackTrace();
//        }
        ct.m2();
    }
}
//unchecked exceptions are automatically propagated
//checked exception are propagated by using throws keyword