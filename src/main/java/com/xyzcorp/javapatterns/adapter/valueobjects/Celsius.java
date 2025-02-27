package com.xyzcorp.javapatterns.adapter.valueobjects;


import java.util.StringJoiner;

public final class Celsius implements Temperature {

    private final int value;

    public Celsius(int value) {
        this.value = value;
    }

    @Override
    public Temperature convertTo(TemperatureScale scale) {
        return switch (scale) {
            case TemperatureScale.FAHRENHEIT -> new Fahrenheit((int) Math.round(9.0 / 5.0 * value + 32));
            case TemperatureScale.CELSIUS -> this;
        };
    }

    @Override
    public Integer getTemperature() {
        return value;
    }

    @Override
    public String toString() {
        return value + "°C";
    }
}
