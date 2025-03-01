package com.xyzcorp.javapatterns.state.functional2;

public sealed interface Score permits Advantage, Fifteen, Forty, Lost, Love,
                                      Thirty, Won {
    default Score wins(Score opponentsScore) {return this;}
    default Score loses(Score opponentsScore){return this;}
}

final class Advantage implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return new Won();
    }

    @Override
    public Score loses(Score opponentsScore) {
        return new Forty();
    }
}

record Fifteen() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return switch (opponentsScore) {
            case Won _, Lost _-> this;
            default -> new Thirty();
        };
    }
}

record Forty() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return switch (opponentsScore) {
            case Won _, Lost _, Advantage _ -> this;
            case Forty _ -> new Advantage();
            default -> new Won();
        };
    }
}

record Love() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return switch(opponentsScore) {
            case Won _, Lost _-> this;
            default -> new Fifteen();
        };
    }
}

record Thirty() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return switch(opponentsScore) {
            case Won _, Lost _-> this;
            default -> new Forty();
        };
    }
}

record Won() implements Score{}
record Lost() implements Score{}
