package com.xyzcorp.javapatterns.factorymethod.example;

public class ConcreteCountryFactory implements CountryFactory {

    @Override
    public Country createCountry(String name, byte[] flag, String capital) {
        //complexity
        return new ConcreteCountry(name, flag, capital);
    }
}
