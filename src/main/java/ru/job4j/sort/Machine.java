package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] result = new int[100];
        int size = 0;
        int balance = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (balance - coins[i] >= 0) {
                balance -= coins[i];
                result[size] = coins[i];
                size += 1;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
