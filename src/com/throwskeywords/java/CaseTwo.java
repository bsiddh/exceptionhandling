package com.throwskeywords.java;

import java.io.FileInputStream;

public class CaseTwo {

    void m2() throws Exception{
        Thread.sleep(1000);
        FileInputStream fi = new FileInputStream("abc.txt");
    }

    void m1() {
       try
       {
           m2();

       }
       catch (Exception fe){
fe.printStackTrace();
       }
    }

    public static void main(String[] args) {
       CaseTwo ct = new CaseTwo();
       ct.m1();
    }
}
