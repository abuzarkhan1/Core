package com.abuzar.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.acc();
        car.brake();
        car.stop();

        System.out.println("Engine Price: " + Engine.PRICE);
    }
}
