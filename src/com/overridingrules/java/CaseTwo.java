package com.overridingrules.java;

public class CaseTwo {

    void m1() throws InterruptedException{
        Thread.sleep(1000);
    }
}
    class CaseTwoChild extends CaseTwo{
        void m1(){

        }
    }

//in above example in parent class method can have exception it is valid