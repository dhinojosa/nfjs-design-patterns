package com.xyzcorp.javapatterns.state.enums;

import java.util.function.BiFunction;

public record TennisGame(Player home, Player opponent) {

    public static TennisGame start(Player home, Player opponent) {
        return new TennisGame(home, opponent);
    }

    public TennisGame nextTurn(BiFunction<Player, Player, Player> biFunction) {
        Player winner = biFunction.apply(home, opponent);
        if (winner.equals(home))
            return new TennisGame(home.beats(opponent), opponent.losesTo(home));
        return new TennisGame(home.losesTo(opponent), opponent.beats(home));
    }

    public String score() {
        return String.format("Home (%s): %s, Opponent(%s): %s", home.name(),
            home.score(), opponent.name(), opponent.score());
    }
}
