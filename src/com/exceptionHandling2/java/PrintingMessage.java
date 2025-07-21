package com.exceptionHandling2.java;

public class PrintingMessage {

    void m3(){
try {
    System.out.print(10/0);
}catch (ArithmeticException ae){
    System.out.println(ae.toString()+"..");
    System.out.println(ae.getMessage()+"--");
    ae.printStackTrace();
}
    }
    void m2(){
        m3();
    }
    void m1(){
        m2();
    }
    public static void main(String[] args) {
      PrintingMessage pm = new PrintingMessage();
      pm.m1();
    }
}
