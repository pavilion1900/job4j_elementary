package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("автобус ездит только по выходным");
    }

    @Override
    public void passengers(int people) {
        System.out.println("Максимальное число пассажиров " + people);
    }

    @Override
    public double fill(double fuel) {
        return fuel * 70;
    }
}
