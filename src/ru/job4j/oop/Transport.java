package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle airPlane = new Plane();
        Vehicle jet = new Plane();
        Vehicle train = new Train();
        Vehicle speedTrain = new Train();
        Vehicle bus = new Bus();
        Vehicle autoBus = new Bus();

        Vehicle[] vehicles = {airPlane, jet, train, speedTrain, bus, autoBus};
        for (Vehicle veh : vehicles) {
            veh.move();
            veh.speed();
        }
    }
}
