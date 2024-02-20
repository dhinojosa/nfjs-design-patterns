package com.xyzcorp.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static String convert(int i) {
        if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
        else if (i % 3 == 0) return "Fizz";
        else if (i % 5 == 0) return "Buzz";
        else return String.valueOf(i);
    }

    @SuppressWarnings("null")
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).boxed()
            .map(FizzBuzz::convert).forEach(System.out::println);
    }
}
