package com.xyzcorp.instructor.tdd;

import java.time.LocalDate;
import java.util.function.Supplier;

import static java.time.temporal.ChronoUnit.YEARS;

public class Programmer {
    private final Supplier<LocalDate> dateSupplier;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    protected Programmer(String firstName, String lastName, LocalDate dateOfBirth, Supplier<LocalDate> dateSupplier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateSupplier = dateSupplier;
    }

    public static Programmer of(String firstName, String lastName, LocalDate birthDate) {
        return new Programmer(firstName, lastName, birthDate, LocalDate::now);
    }

    public int getAge() {
        return (int) YEARS.between(dateOfBirth, dateSupplier.get());
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
