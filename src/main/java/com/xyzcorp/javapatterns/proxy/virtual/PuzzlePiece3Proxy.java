package com.xyzcorp.javapatterns.proxy.virtual;

/**
 * @author John Ericksen
 */
public class PuzzlePiece3Proxy implements PuzzlePiece3 {

    @SuppressWarnings("unused")
    private PuzzlePiece3 proxied;

    public void setProxied(PuzzlePiece3 proxied) {
        this.proxied = proxied;
    }
}
