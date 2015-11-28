package com.physix.lab;

public enum WorldLoop {

    INSTANCE;

    final int TICKS_PER_SECOND = 2;
    final int SKIP_TICKS = 1000 / TICKS_PER_SECOND;
    final int MAX_FRAME_SKIP = 5;


    public void Loop(Phisix phisix, Display display) {

        boolean gameIsRunning = true;
        int loops;
        double interpolation;
        long nextGameTick = System.currentTimeMillis();

        while(gameIsRunning) {
            loops = 0;
            while(System.currentTimeMillis() > nextGameTick && loops < MAX_FRAME_SKIP) {
                phisix.updatePhysix();
                nextGameTick += SKIP_TICKS;
                loops++;
            }
            interpolation = (double)((System.currentTimeMillis() + SKIP_TICKS - nextGameTick) / SKIP_TICKS);
            display.displyPhisix();
        }

    }

}
