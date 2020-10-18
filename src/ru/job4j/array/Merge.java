package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[count] = left[i];
            count++;
        }
        for (int i = 0; i < right.length; i++) {
            rsl[count++] = right[i];
        }
        Arrays.sort(rsl);
        return rsl;
    }
}
