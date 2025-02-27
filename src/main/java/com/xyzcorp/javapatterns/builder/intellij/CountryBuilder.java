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


    public Country build() {
        return new Country(this);
    }
}
