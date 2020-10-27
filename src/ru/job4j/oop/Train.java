package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " передвигается по рельсам ");
    }

    @Override
    public void speed() {
        System.out.println("80 км/ч");
    }
}
