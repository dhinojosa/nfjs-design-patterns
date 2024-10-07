package com.xyzcorp.functional;

public class StringMonoid implements Monoid<String>{
    @Override
    public String append(String v1, String v2) {
        return v1 + v2;
    }
}
