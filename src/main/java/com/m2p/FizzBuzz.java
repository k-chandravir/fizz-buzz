package com.m2p;

public class FizzBuzz {

    public Boolean hasThree(int inputNumber){
        while(inputNumber>0){
            if(inputNumber % 3 == 3){
                return true;
            }
            inputNumber /= 10;
        }
        return false;
    }

    public Boolean hasFive(int inputNumber){
        while(inputNumber>0){
            if(inputNumber % 5 == 5){
                return true;
            }
            inputNumber /= 10;
        }
        return false;
    }
    public String getFizzBuzz(int inputNumber) {
        if(inputNumber % 3 == 0 && inputNumber % 5 == 0){
            return "FizzBuzz";
        }
        else if(inputNumber % 3 == 0 || hasThree(inputNumber)){
            return "Fizz";
        }
        else if(inputNumber % 5 == 0 || hasFive(inputNumber)){
            return "Buzz";
        }else
            return String.valueOf(inputNumber);
    }
}
