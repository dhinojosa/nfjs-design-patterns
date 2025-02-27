package com.xyzcorp.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void testOne() {
        Assertions.assertThat(FizzBuzz.apply(1)).isEqualTo("1");
    }

    @Test
    void testTwo() {
        Assertions.assertThat(FizzBuzz.apply(2)).isEqualTo("2");
    }

    @Test
    void testThree() {
        Assertions.assertThat(FizzBuzz.apply(3)).isEqualTo("Fizz");
    }

    @Test
    void testFive() {
        Assertions.assertThat(FizzBuzz.apply(5)).isEqualTo("Buzz");
    }

    @Test
    void testWhatHappensIfNegative(){}
}
