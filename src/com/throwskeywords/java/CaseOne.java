package com.throwskeywords.java;

public class CaseOne {

    void movie() throws InterruptedException{
     System.out.println("Lag in story movement");
     System.out.println(1000);
     System.out.println("good to watch crime thriller");
    }
    void performance() throws  InterruptedException{
     movie();
    }
    void scene() throws InterruptedException{
      performance();
    }
    void characteriztion() throws InterruptedException{
           scene();;
    }
    void script() throws InterruptedException{
        characteriztion();
    }
    public static void main(String[] args)  throws  InterruptedException{
        CaseOne cO = new CaseOne();
       cO.script();
    }

    //here JVM will handle the exception
    //or else exception will raised in corresponding methods

}
