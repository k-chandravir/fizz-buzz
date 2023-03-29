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

            String actual = number.getFizzBuzz(21);

            assertEquals(expected, actual);
        }
    }

    @Nested
    class Buzz{
        @Test
        void toReturnBuzzWhenTheNumberIsTwenty(){
            String expected = "Buzz";

            String actual = number.getFizzBuzz(20);

            assertEquals(expected, actual);
        }
    }

    @Nested
    class NumberItself{
        @Test
        void toReturnFourWhenNeitherDividedByThreeNorFive(){
            String expected = "4";

            String actual = number.getFizzBuzz(4);

            assertEquals(expected, actual);
        }
    }

}
