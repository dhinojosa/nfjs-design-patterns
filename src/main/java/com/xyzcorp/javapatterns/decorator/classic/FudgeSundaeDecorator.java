package com.xyzcorp.javapatterns.decorator.classic;

/**
 * @author John Ericksen
 */
public class FudgeSundaeDecorator extends SundaeDecorator {
    public FudgeSundaeDecorator(Sundae sundae) {
        super(sundae);
    }

    public String describeSundae() {
        return "Fudge " + getDecorated().describeSundae();
    }
}
