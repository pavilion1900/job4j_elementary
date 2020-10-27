package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman sidorov = new Freshman();
        Student petrov = sidorov;
        Object men = sidorov;

        Student ivanov = new Freshman();
        Object youngMen = new Freshman();
    }
}
