package com.xyzcorp.instructor.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("unused")
public class ProgrammerTest {

    @Test
    @Tag("unit")
    void testAgeOfJamesGosling() {
        Programmer jamesGosling = new Programmer("James", "Gosling", LocalDate.of(1955, 5, 19),
            () -> LocalDate.of(2025, 1, 14));
        assertThat(jamesGosling.getAge()).isEqualTo(69);
    }

    @Test
    @Tag("integration")
    void testAgeOfJamesGoslingForTheEndUser() {
        Programmer jamesGosling = Programmer.of("James", "Gosling", LocalDate.of(1955, 5, 19));
        assertThat(jamesGosling.getAge()).isGreaterThanOrEqualTo(69);
    }
}
