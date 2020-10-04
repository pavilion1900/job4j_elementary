package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, int percent) {
        int year = 1;
        amount += amount * percent / 100;
        while (amount > salary) {
            amount -= salary;
            amount += amount * percent / 100;
            year++;
        }
        return year;
    }
}
