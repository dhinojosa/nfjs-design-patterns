package com.xyzcorp.functional;

public interface Monoid<A> {
    public A append(A v1, A v2);
}
