package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz number = new FizzBuzz();

    @Nested
    class Fizz{
        @Test
        void toReturnFizzWhenTheNumberIsTwentyOne(){
            String expected = "Fizz";

            String actual = number.getFizzBuzz(96);

            assertEquals(expected, actual);
        }
    }

}
