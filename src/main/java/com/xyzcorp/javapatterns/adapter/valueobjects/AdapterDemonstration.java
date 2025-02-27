package com.xyzcorp.javapatterns.adapter.valueobjects;



public class AdapterDemonstration {
    public static void main(String[] args) {
        Celsius celsius = new Celsius(32);
        Temperature fahrenheit = celsius.convertTo(TemperatureScale.FAHRENHEIT);
        System.out.println(fahrenheit);

        Temperature celsius2 = celsius.convertTo(TemperatureScale.CELSIUS);
        System.out.println(celsius2);
    }
}
