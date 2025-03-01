package com.xyzcorp.javapatterns.state.enums;

import static com.xyzcorp.javapatterns.state.enums.Score.*;

public record Player(String name, Score score) {
    public Player(String name) {
        this(name, Love);
    }

    public Player beats(Player opponent) {
        return new Player(name, score.wins(opponent.score));
    }

    public Player losesTo(Player opponent) {
        return new Player(name, score.loses(opponent.score));
    }
}
