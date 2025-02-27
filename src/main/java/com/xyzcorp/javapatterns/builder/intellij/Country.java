package com.xyzcorp.javapatterns.builder.intellij;

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

    private Country(String name, String capital, String demonym,
                   int population, String currency) {
        this.name = name;
        this.capital = capital;
        this.demonym = demonym;
        this.population = population;
        this.currency = currency;
    }

    protected Country(CountryBuilder countryBuilder) {
        this.name = countryBuilder.getName();
        this.capital = countryBuilder.getCapital();
        this.demonym = countryBuilder.getDemonym();
        this.population = countryBuilder.getPopulation();
        this.currency = countryBuilder.getCurrency();
    }

    public CountryBuilder builder() {
        return new CountryBuilder();
    }
}
