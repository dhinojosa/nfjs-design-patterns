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

    protected Country(String name, String capital, String demonym,
                   int population, String currency) {
        this.name = name;
        this.capital = capital;
        this.demonym = demonym;
        this.population = population;
        this.currency = currency;
    }
}
