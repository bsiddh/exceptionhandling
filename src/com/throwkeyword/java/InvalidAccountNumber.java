package com.throwkeyword.java;

 class InvalidAccountNumber extends RuntimeException {

    InvalidAccountNumber(String accountNumber){
          super(accountNumber);
    }
}
//here paramaetrized constructor for message
//and default constructor to print type of exception
//here run time for unchecked
//exception for checked