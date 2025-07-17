package com.exceptionhandling1.java;

public class UncheckedException {

    public static void main(String[] args) {
        System.out.println("sidd world");
//        System.out.println(10/0);//AE
        int[] a = {10,20,30};
//        System.out.println(a[5]);//IOBE
//        System.out.println("sidd".charAt(4));
//        Integer i = Integer.valueOf("10");//NFE
        System.out.println("Rest of the application :");
//here all the exception aren't checked by compiler.
    }
}
