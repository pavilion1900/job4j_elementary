package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] result = new int[100];
        int size = 0;
        for (int i = 0; i < coins.length; i++) {
            while ((money - price > 0) && (money - price >= coins[i])) {
                price += coins[i];
                result[size] = coins[i];
                size += 1;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
