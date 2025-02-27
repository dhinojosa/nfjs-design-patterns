package com.xyzcorp.javapatterns.decorator.functional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DecoratorDemonstration {

    public static void main(String[] args) {

        UnaryOperator<String> whipcream = s -> "Whipcream " + s;
        UnaryOperator<String> fudge = s -> "Fudge " + s;
        UnaryOperator<String> nuts = s -> "Nuts " + s;
        UnaryOperator<String> cherryOnTop = s -> s + " with a Cherry on top";
        UnaryOperator<String> fudgeFilter = s -> s.replaceAll("Fudge", "xxxxx");

        Function<String, String> sundae = whipcream
            .andThen(fudge)
            .andThen(nuts);

        System.out.println(sundae.apply("Vanilla Ice Cream"));

        Function<String, String> sundaeWithCherry = sundae.andThen(cherryOnTop);
        System.out.println(sundaeWithCherry.apply("Vanilla Ice Cream"));  // Output: Nuts Fudge Whipcream Vanilla Ice Cream with a Cherry on top

        Function<String, String> filteredSundae = sundaeWithCherry.andThen(fudgeFilter);
        System.out.println(filteredSundae.apply(""));  // Output: Nuts xxxxx Whipcream Vanilla Ice Cream with a Cherry on top
    }
}
