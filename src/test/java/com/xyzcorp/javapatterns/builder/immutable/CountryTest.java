package com.xyzcorp.javapatterns.builder.immutable;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountryTest {
    @Test
    void testCountryBuilderWithNewZealand() {
        Country newZealand = Country.builder()
            .setName("New Zealand")
            .setCapital("Auckland")
            .setPopulation(5130000)
            .setDemonym("New Zealander")
            .setCurrency("Dollar").build();

        assertThat(newZealand.getName()).isEqualTo("New Zealand");
        assertThat(newZealand.getCapital()).isEqualTo("Auckland");
        assertThat(newZealand.getPopulation()).isEqualTo(5130000);
        assertThat(newZealand.getDemonym()).isEqualTo("New Zealander");
        assertThat(newZealand.getCurrency()).isEqualTo("Dollar");
    }

    @Test
    void testCountryBuilderWithKenya() {
        Country kenya = Country.builder()
            .setName("Kenya")
            .setCapital("Nairobi")
            .setPopulation(53772000)
            .setDemonym("Kenyan")
            .setCurrency("Shilling").build();

        assertThat(kenya.getName()).isEqualTo("Kenya");
        assertThat(kenya.getCapital()).isEqualTo("Nairobi");
        assertThat(kenya.getPopulation()).isEqualTo(53772000);
        assertThat(kenya.getDemonym()).isEqualTo("Kenyan");
        assertThat(kenya.getCurrency()).isEqualTo("Shilling");
    }
}
