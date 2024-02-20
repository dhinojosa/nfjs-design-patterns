package com.xyzcorp.javapatterns.mediator;

public class SpouseInfoWidget implements Component {
    @SuppressWarnings("unused")
    private boolean enabled;

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
