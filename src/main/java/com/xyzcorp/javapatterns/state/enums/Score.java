package com.xyzcorp.javapatterns.state.enums;

//Thanks to https://github.com/chabala/ for the `enum` version of the state pattern

public enum Score {
    Advantage {
        @Override
        public Score wins(Score opponentsScore) {
            return Won;
        }
        @Override
        public Score loses(Score opponentsScore) {
            return Forty;
        }
    },
    Fifteen {
        @Override
        public Score wins(Score opponentsScore) {
            return switch (opponentsScore) {
                case Won, Lost -> this;
                default -> Thirty;
            };
        }
    },
    Forty {
        @Override
        public Score wins(Score opponentsScore) {
            return switch (opponentsScore) {
                case Won, Lost, Advantage -> this;
                case Forty -> Advantage;
                default -> Won;
            };
        }
    },
    Lost,
    Love {
        @Override
        public Score wins(Score opponentsScore) {
            return switch(opponentsScore) {
                case Won, Lost -> this;
                default -> Fifteen;
            };
        }
    },
    Thirty {
        @Override
        public Score wins(Score opponentsScore) {
            return switch(opponentsScore) {
                case Won, Lost -> this;
                default -> Forty;
            };
        }
    },
    Won;

    Score wins(Score opponentsScore) {
        return this;
    }
    Score loses(Score opponentsScore) {
        return this;
    }
}
