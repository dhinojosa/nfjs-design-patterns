package com.xyzcorp.javapatterns.builder.immutable;


import java.util.Objects;
import java.util.StringJoiner;

public class Country {
    @SuppressWarnings("unused")
    private final String name;
    @SuppressWarnings("unused")
    private final String capital;
    @SuppressWarnings("unused")
    private final String demonym;
    @SuppressWarnings("unused")
    private final int population;
    @SuppressWarnings("unused")
    private final String currency;

    Country(CountryBuilder countryBuilder) {
        this.name = countryBuilder.getName();
        this.capital = countryBuilder.getCapital();
        this.demonym = countryBuilder.getDemonym();
        this.population = countryBuilder.getPopulation();
        this.currency = countryBuilder.getCurrency();
    }

    public static CountryBuilder builder() {
        return new CountryBuilder();
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getDemonym() {
        return demonym;
    }

    public int getPopulation() {
        return population;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Country country)) return false;
        return population == country.population && Objects.equals(name, country.name)
               && Objects.equals(capital, country.capital) &&
               Objects.equals(demonym, country.demonym) && Objects.equals(currency, country.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, demonym, population, currency);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Country.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .add("capital='" + capital + "'")
            .add("demonym='" + demonym + "'")
            .add("population=" + population)
            .add("currency='" + currency + "'")
            .toString();
    }
}
