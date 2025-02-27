package com.xyzcorp.javapatterns.decorator.classic;

/**
 * @author John Ericksen
 */
public class CherryOnTopDecorator extends SundaeDecorator {
    public CherryOnTopDecorator(Sundae sundae) {
        super(sundae);
    }

    public String describeSundae() {
        return getDecorated().describeSundae() + " with a Cherry on top";
    }
}
