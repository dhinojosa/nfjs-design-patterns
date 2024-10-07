package com.xyzcorp.javapatterns.singleton.modern;

public class MySingletonClient {
    public static void main(String[] args) {
        MySingleton instance1 = MySingleton.INSTANCE;
        MySingleton instance2 = MySingleton.INSTANCE;
        MySingleton instance3 = MySingleton.INSTANCE;
        assert instance1 == instance2;
        assert instance3 == instance2;
    }
}
