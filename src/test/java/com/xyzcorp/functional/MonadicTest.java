package com.xyzcorp.functional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;

public class MonadicTest {

    // The Functional Design Patterns
    // Monoid  -> combine
    // Functor -> map
    // Monad   -> flatMap

    // List<Cat> map (Cat c -> c.applyCollar(collar))
    // Observable[Integer], Flux[String], List[Employee], Future[Cow],
    // Optional[Cat], Stream[Capybara] do contain map, flatMap

    public <E> E joinAll(List<E> list, Monoid<E> monoid) {
        E result = null;
        for (E e : list) {
            if (result == null) result = e;
            else result = monoid.append(result, e);
        }
        return result;
    }

    @Test
    void testMonoid() {
        List<String> list = List.of("One", "Two", "Three");
        String result = joinAll(list, new StringMonoid());
        System.out.println(result);
    }

    @Test
    void testFunctorInAStream() {
        List<Integer> result =
            Stream.of(1, 2, 3, 4)
                .map(x -> x * 10) //functor = map
                .collect(Collectors.toList());
        assertThat(result).contains(10, 20, 30, 40);
    }

    @Test
    void testEvilFunctorInAStream() {
        List<Integer> result =
            Stream.<Integer>empty()
                .map(x -> x * 10) //functor = map
                .collect(Collectors.toList());
        System.out.println(result);
    }

    @Test
    void testFunctorInAOptional() {
        Optional<Integer> optionalInteger =
            Optional
                .of(40)
                .map(x -> x * 10);//functor = map

        System.out.println(optionalInteger);
    }

    @Test
    void testEvilFunctorInAOptional() {
        Optional<Integer> optionalInteger =
            Optional.<Integer>empty()
                .map(x -> x * 10)
                .map(x -> x + 20);//functor = map

        System.out.println(optionalInteger);
    }


    @Test
    void testBadMonad() {
        //explode! multiplier
        Stream.of(1, 2, 3, 4).map(x -> Stream.of(-x, x, x + 1));
    }

    @Test
    void testMonad() {
        Stream<Integer> integerStream =
            Stream.of(1, 2, 3, 4)
                .flatMap(x -> Stream.of(-x, x, x + 1));
        System.out.println(integerStream.collect(Collectors.toList()));
    }

    @Test
    void testEvilStreamMonad() {
        Stream<Integer> integerStream =
            Stream.of(1, 2, 3, 4).flatMap(x -> Stream.empty());
        System.out.println(integerStream.collect(Collectors.toList()));
    }

    @Test
    void testSkippingBadStuff() {
        Stream<Integer> integerStream = Stream.of(10, 1, 20, 0, 5, 25);
        Stream<Integer> mappedStream = integerStream.flatMap(x -> {
            try {
                return Stream.of(100 / x);
            } catch (ArithmeticException ae) {
                return Stream.empty();
            }
        });

        List<Integer> result = mappedStream.collect(Collectors.toList());
        assertThat(result).isEqualTo(List.of(10, 100, 5, 20, 4));
    }

    @Test
    void testMonadComposition() {
        Optional<Integer> result =
            Optional.of(30).flatMap(x ->
                Optional.<Integer>empty().flatMap(y ->
                    Optional.of(10).map(z -> x + y + z)));
        System.out.println(result);

    }
}
