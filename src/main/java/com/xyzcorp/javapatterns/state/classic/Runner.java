package com.xyzcorp.javapatterns.state.classic;


public class Runner {
    public static void main(String[] args) {
        SwitchStateContext switchStateContext = new SwitchStateContext();
        SwitchStateFactory switchStateFactory = new SwitchStateFactory(switchStateContext);
        SwitchState onState = switchStateFactory.getOnState();
        onState.execute();
        System.out.println(switchStateContext.getSwitchState());

    }
}
