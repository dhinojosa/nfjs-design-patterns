package com.xyzcorp.javapatterns.adapter.valueobjects;


public sealed interface Temperature permits Celsius, Fahrenheit {
    Temperature convertTo(TemperatureScale scale);
    Integer getTemperature();
}
