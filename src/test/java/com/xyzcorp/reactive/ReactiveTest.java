package com.xyzcorp.reactive;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.junit.jupiter.api.Test;

public class ReactiveTest {
    @Test
    void testReactiveUsingRXJava() {
        Observable<Long> longObservable =
            Observable.create(emitter -> {
                emitter.onNext(100L);
                emitter.onNext(140L);
                emitter.onNext(290L);
                emitter.onNext(10L);
                emitter.onComplete();
            });

        longObservable
            .map(x -> x * 10)
            .subscribe(System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done"));

        longObservable
            .filter(x -> x < 150)
            .subscribe(System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done"));
    }

    @Test
    void testReactiveWithThreadBoundariesOrBulkheads() {
        Observable.just(1,2,3,4,5)               //io(1)
            .observeOn(Schedulers.computation()) //computation
            .subscribeOn(Schedulers.io())        //computation
            .map(i -> i * 10)                    //computation
            .observeOn(Schedulers.io())          //io(2)
            .subscribe(this::updateTheDatabase); //io(2)
    }

    private void updateTheDatabase(Integer i) {

    }
}
