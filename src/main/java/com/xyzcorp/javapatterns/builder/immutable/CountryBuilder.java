package com.xyzcorp.javapatterns.builder.immutable;

public class CountryBuilder {
    private final String name;
    private final String capital;
    private final String demonym;
    private final int population;
    private final String currency;

    private CountryBuilder(String name, String capital, String demonym,
                           int population, String currency) {
        this.name = name;
        this.capital = capital;
        this.demonym = demonym;
        this.population = population;
        this.currency = currency;
    }

    CountryBuilder() {
        this(null, null, null, 0, null);
    }

    protected CountryBuilder setName(String name) {
        return new CountryBuilder(name, this.capital, this.demonym, this.population, this.currency);
    }

    protected CountryBuilder setCapital(String capital) {
        return new CountryBuilder(this.name, capital, this.demonym, this.population, this.currency);
    }

    protected CountryBuilder setDemonym(String demonym) {
        return new CountryBuilder(this.name, this.capital, demonym, this.population, this.currency);
    }

    protected CountryBuilder setPopulation(int population) {
        return new CountryBuilder(this.name, this.capital, this.demonym, population, this.currency);
    }

    protected CountryBuilder setCurrency(String currency) {
        return new CountryBuilder(this.name, this.capital, this.demonym, population, currency);
    }

    public Country build() {
        return new Country(this);
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
}
