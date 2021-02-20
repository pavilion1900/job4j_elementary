package ru.job4j.loop;

public class Multipliers {
    public static void out(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        out(1);
        System.out.println();
        out(2);
        System.out.println();
        out(6);
        System.out.println();
        out(7);
    }
}