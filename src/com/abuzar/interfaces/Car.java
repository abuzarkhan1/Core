package com.abuzar.interfaces;

public class Car implements Engine, Brake {

    @Override
    public void brake() {
        System.out.println("Brake applied");
    }

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating");
    }
}
