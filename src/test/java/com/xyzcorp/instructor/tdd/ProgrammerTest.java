package com.xyzcorp.instructor.tdd;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgrammerTest {

    @Test
    void testProgrammerName() {
        Programmer programmer = new Programmer(
            "Bjarne", "Stroustrup", LocalDate.of(1950, 12, 30), () -> LocalDate.of(2018, 6, 1));
        String result = programmer.getFullName();
        assertThat(result).isEqualTo("Bjarne Stroustrup");
    }

    @Test
    void testProgrammerNamePython() {
        Programmer programmer = new Programmer(
            "Guido", "Van Rossum", LocalDate.of(1956, 1, 31), () -> LocalDate.of(2018, 6, 1));
        String result = programmer.getFullName();
        assertThat(result).isEqualTo("Guido Van Rossum");
    }

    @Test
    void testProgrammerAgeWithBjarne() {
        Programmer programmer = new Programmer(
            "Bjarne", "Stroustrup", LocalDate.of(1950, 12, 30), () -> LocalDate.of(2018, 6, 1));
        int result = programmer.getAge();
        assertThat(result).isEqualTo(67);
    }

    @Test
    void testProgrammerAgePythonGuido() {
        Programmer programmer = new Programmer(
            "Guido", "Van Rossum", LocalDate.of(1956, 1, 31), () -> LocalDate.of(2018, 6, 1));
        int result = programmer.getAge();
        assertThat(result).isEqualTo(62);
    }

    @Test
    void testStaticFactoryAndHideTheComplexity() {
        Programmer guidoVanRossum = Programmer.of("Guido", "Van Rossum", LocalDate.of(1956, 1, 31));
        assertThat(guidoVanRossum.getAge()).isGreaterThan(62);
    }
}
