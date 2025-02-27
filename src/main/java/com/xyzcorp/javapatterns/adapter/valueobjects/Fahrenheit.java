package com.xyzcorp.javapatterns.adapter.valueobjects;

/**
 * @author John Ericksen
 */
public final class Fahrenheit implements Temperature {

    private final int value;

    public Fahrenheit(int value) {
        this.value = value;
    }

    @Override
    public Temperature convertTo(TemperatureScale scale) {
        return switch(scale) {
            case TemperatureScale.FAHRENHEIT -> this;
            case TemperatureScale.CELSIUS -> new Celsius((int) Math.round(5.0 / 9.0 * (value - 32)));
        };
    }

    @Override
    public Integer getTemperature() {
        return value;
    }
    @Override
    public String toString() {
        return value + "°F";
    }
}
