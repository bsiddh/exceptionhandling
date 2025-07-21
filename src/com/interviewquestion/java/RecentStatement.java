package com.interviewquestion.java;

public class RecentStatement {
    int integerValue(){
        try{
            return 10;
        }catch(ArithmeticException ae) {
            return  20;
        }finally{
            return 30;
        }

    }

    public static void main(String[] args) {
        RecentStatement rs = new RecentStatement();
       int value = rs.integerValue();
        System.out.println(value);
    }
    //here as well the latest statement has been execuited
}
