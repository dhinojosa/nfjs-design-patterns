package com.xyzcorp.javapatterns.singleton.eager;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:37 PM
 */
public class EagerSingletonClient {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        assert eagerSingleton == eagerSingleton2;
        assert eagerSingleton.hashCode() == eagerSingleton2.hashCode();
        assert eagerSingleton.equals(eagerSingleton2);
        assert eagerSingleton.toString().equals(eagerSingleton2.toString());
    }
}
