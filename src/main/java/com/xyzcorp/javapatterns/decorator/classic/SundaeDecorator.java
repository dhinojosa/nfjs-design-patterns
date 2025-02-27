package com.xyzcorp.javapatterns.decorator.classic;

/**
 * @author John Ericksen
 */
public abstract class SundaeDecorator implements Sundae {

    private Sundae decorated;

    public SundaeDecorator(Sundae decorated) {
        this.decorated = decorated;
    }

    public Sundae getDecorated() {
        return decorated;
    }
}
