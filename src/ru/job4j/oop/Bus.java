package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " двигается по скоростным трассам ");
    }

    @Override
    public void speed() {
        System.out.println("60 км/ч");
    }
}
