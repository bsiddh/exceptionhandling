package com.overridingrules.java;

public class CaseOne {

    void profession() throws ArithmeticException{
        System.out.println(10/0);
    }

    class CaseOneChild extends  CaseOne{
       void profession() throws  ArithmeticException{
           System.out.println("Exception handled");
        }

        //Rule One:
        //in the given example thenoverriden method can have only unchecked exception
        //but in given example it throws the checked exception that is interupt exception
    }

}
