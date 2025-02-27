package com.xyzcorp.javapatterns.state.functional;


public class Runner {
    public static void main(String[] args) {

        TennisGame tennisGame = TennisGame.start(new Player("Salvador"),
            new Player("Rafael"));

        System.out.println(tennisGame.score());

        TennisGame state1 = tennisGame
            .nextTurn((sal, rafael) -> rafael)
            .nextTurn((sal, rafael) -> sal)
            .nextTurn((sal, rafael) -> rafael);

        System.out.println(state1.score());


        //Create a different scenario
        TennisGame alternativeUniverse = state1.nextTurn((sal, rafael) -> sal)
            .nextTurn((sal, rafael) -> sal)
            .nextTurn((sal, rafael) -> sal)
            .nextTurn((sal, rafael) -> sal);

        System.out.println(alternativeUniverse.score());
//
//
        TennisGame state2 = state1
            .nextTurn((sal, rafael) -> rafael)
            .nextTurn((sal, rafael) -> sal)
            .nextTurn((sal, rafael) -> rafael);
//
//
        TennisGame resultGame =
            state2 //Game already won, Sal fifteen, Ray Won
                   .nextTurn((sal, rafael) -> sal)
                   .nextTurn((sal, rafael) -> rafael);

        System.out.println(state1.score());
        System.out.println(state2.score());
        System.out.println(alternativeUniverse.score());
        System.out.println(resultGame.score());
    }
}
