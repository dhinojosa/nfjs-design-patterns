package com.xyzcorp.instructor.tdd;

import java.time.LocalDate;
import java.util.function.Supplier;

import static java.time.temporal.ChronoUnit.YEARS;

public class Programmer {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final Supplier<LocalDate> localDateSupplier;

    protected Programmer(String firstName, String lastName, LocalDate birthDate,
                         Supplier<LocalDate> todaysDateSupplier) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.localDateSupplier = todaysDateSupplier;
    }

    public static Programmer of(String firstName, String lastName, LocalDate birthDate) {
        return new Programmer(firstName, lastName, birthDate, LocalDate::now);
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public int getAge() {
        return (int) YEARS.between(birthDate, localDateSupplier.get());
    }
}
