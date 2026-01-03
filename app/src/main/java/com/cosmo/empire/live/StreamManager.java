package com.cosmo.empire.live;

public class StreamManager {
    private static final int MAX_WINDOWS = 20;

    public void initializeLive() {
        for(int i=1; i<=MAX_WINDOWS; i++) {
            System.out.println("Ventanilla " + i + " conectada al Nodo Invisible.");
        }
    }
}
