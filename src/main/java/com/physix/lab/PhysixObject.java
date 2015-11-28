package com.physix.lab;

/**
 * Created by arch on 11/28/15.
 */
public class PhysixObject {

    private Vector2D acceleration;
    private Vector2D velocity;
    private Vector2D position;

    public PhysixObject() {
        this(new Vector2D(), new Vector2D(), new Vector2D());
    }

    public PhysixObject(Vector2D acceleration, Vector2D position, Vector2D velocity) {
        this.acceleration = acceleration;
        this.position = position;
        this.velocity = velocity;
    }

    public Vector2D getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Vector2D acceleration) {
        this.acceleration = acceleration;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }
}
