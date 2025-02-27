package com.xyzcorp.functional;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;


public interface Monad <A extends Collection<A>> extends Functor<A>{
    public <B> Collection<B> flatMap(Function<A, List<B>> function);
}
