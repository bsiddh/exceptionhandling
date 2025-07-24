package com.throwkeyword.java;

import java.util.*;

public class CustomerDetails {

    static void customerAccountNumber(Long accountNumber) throws  InvalidAccountNumber{
        if (accountNumber==10){
            System.out.println("Account details");
        }else{

                throw new InvalidAccountNumber("Invalid account number ");


        }
    }

    public static void main(String[] args)  throws InvalidAccountNumber {
        Scanner passTheValue = new Scanner(System.in);
        System.out.println("Enter the account number");
        Long accountNumber = passTheValue.nextLong();
        CustomerDetails.customerAccountNumber(accountNumber);
    }
}
