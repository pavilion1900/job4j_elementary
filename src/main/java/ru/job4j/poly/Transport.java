package ru.job4j.poly;

public interface Transport {
    void move();

    void passengers(int people);

    double fill(double fuel);
}
