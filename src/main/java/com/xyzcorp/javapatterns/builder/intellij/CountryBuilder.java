package com.xyzcorp.javapatterns.builder.intellij;

public class CountryBuilder {
    private String name;
    private String capital;
    private String demonym;
    private int population;
    private String currency;

    public CountryBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CountryBuilder setCapital(String capital) {
        this.capital = capital;
        return this;
    }

    public CountryBuilder setDemonym(String demonym) {
        this.demonym = demonym;
        return this;
    }

    public CountryBuilder setPopulation(int population) {
        this.population = population;
        return this;
    }

    public CountryBuilder setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Country createCountry() {
        return new Country(name, capital, demonym, population, currency);
    }
}
