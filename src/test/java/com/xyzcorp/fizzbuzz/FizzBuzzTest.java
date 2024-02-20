package com.xyzcorp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    //ZOMBIES
    //Zero
    //One
    //Many
    //Boundary
    //Interface
    //Exceptions
    //Simplicity


    @Test
    void testFizzBuzzOne() {
        String result = FizzBuzz.convert(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void testFizzBuzzTwo() {
       assertThat(FizzBuzz.convert(2)).isEqualTo("2");
    }

    @Test
    void testFizzBuzzThree() {
        assertThat(FizzBuzz.convert(3)).isEqualTo("Fizz");
    }

    @Test
    void testFizzBuzzFive() {
        assertThat(FizzBuzz.convert(5)).isEqualTo("Buzz");
    }

    @Test
    void testFizzBuzzTen() {
        assertThat(FizzBuzz.convert(10)).isEqualTo("Buzz");
    }

    @Test
    void testFizzBuzzSix() {
        assertThat(FizzBuzz.convert(6)).isEqualTo("Fizz");
    }

    @Test
    void testFizzBuzzFifteen() {
        assertThat(FizzBuzz.convert(15)).isEqualTo("FizzBuzz");
    }
}
