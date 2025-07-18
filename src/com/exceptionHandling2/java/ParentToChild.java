package com.exceptionHandling2.java;

import java.util.Scanner;

public class ParentToChild {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the value");
            int num = scan.nextInt();
            System.out.print(10/num);
            System.out.print("ratan ".charAt(12));

        } catch (Exception e) {
            System.out.print("Exception already handled");
        }
//        catch (ArithmeticException ae){
//            System.out.print("Arithmatic exception");
//        }
    }
    //in above code arithmatic exception handled at first catch block itself
    //and it is misordered i.e is parent to child
    //ideally it should be child to parent and it is runtime exception
}
