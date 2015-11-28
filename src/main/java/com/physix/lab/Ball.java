package com.physix.lab;

/**
 * Created by arch on 11/28/15.
 */
public class Ball extends PhysixObject {

    public Ball() {
        super(new Vector2D(), new Vector2D(200, 200), new Vector2D());
    }

    public Ball(Vector2D acceleration, Vector2D position, Vector2D velocity) {
        super(acceleration, position, velocity);
    }
}
