package com.m2p;

public class FizzBuzz {
    public String getFizzBuzz(int inputNumber) {
        if(inputNumber % 3 == 0){
            return "Fizz";
        }
        else if(inputNumber % 5 == 0){
            return "Buzz";
        }else
            return String.valueOf(inputNumber);
    }
}
