package com.xyzcorp.functional;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

interface Functor<A extends Collection<A>> {
    public <B> Collection<B> map(Function<A, B> function);
}
