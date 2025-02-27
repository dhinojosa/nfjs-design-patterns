package com.xyzcorp.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

        }
    }

    public static String apply(int candidate) {
        if (candidate % 3 == 0) {
            return "Fizz";
        }
        if (candidate % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(candidate);
    }
}
