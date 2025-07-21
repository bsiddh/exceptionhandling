package com.finallyblock.java;

public class CaseSeven {
    public static void main(String[] args) {
        try {
          System.out.println("try");
          System.exit(0);
        }
        finally {
            System.out.println("finally block excuited");
        }
    }
    //finally block won't be execuited
   //due to .exit statement finally block won't be execuited
}
