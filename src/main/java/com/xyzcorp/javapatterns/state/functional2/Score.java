package com.xyzcorp.javapatterns.state.functional2;

public sealed interface Score permits Advantage, Fifteen, Forty, Lost, Love,
                                      Thirty, Won {
    Score wins(Score opponentsScore);
    Score loses(Score opponentsScore);
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
            case Won w -> this;
            case Lost s -> this;
            default -> new Thirty();
        };
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}

record Forty() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return switch (opponentsScore) {
            case Won w -> this;
            case Lost s -> this;
            case Forty f -> new Advantage();
            case Advantage a -> this;
            default -> new Won();
        };
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}

record Love() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return switch(opponentsScore) {
            case Won w -> this;
            case Lost s -> this;
            default -> new Fifteen();
        };
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}

record Thirty() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return switch(opponentsScore) {
            case Won w -> this;
            case Lost s -> this;
            default -> new Forty();
        };
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}

record Won() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return this;
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}

record Lost() implements Score {
    @Override
    public Score wins(Score opponentsScore) {
        return this;
    }

    @Override
    public Score loses(Score opponentsScore) {
        return this;
    }
}



