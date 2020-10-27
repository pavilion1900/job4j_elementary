package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " летает ");
    }

    @Override
    public void speed() {
        System.out.println("900 км/ч");
    }
}
