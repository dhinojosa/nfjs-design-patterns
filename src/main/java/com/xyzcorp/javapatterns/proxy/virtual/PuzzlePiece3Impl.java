package com.xyzcorp.javapatterns.proxy.virtual;

/**
 * @author John Ericksen
 */
public class PuzzlePiece3Impl implements PuzzlePiece3 {

    @SuppressWarnings("unused")
    private PuzzlePiece1 puzzlePiece1;

    public PuzzlePiece3Impl(PuzzlePiece1 puzzlePiece1) {
        this.puzzlePiece1 = puzzlePiece1;
    }
}
