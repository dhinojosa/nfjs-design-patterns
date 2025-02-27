package com.xyzcorp.functional;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;


//F[A]
//Collection<String>
//Optional<Integer>

interface Functor<A extends Collection<A>> {
    public <B> Collection<B> map(Function<A, B> function);
}
