package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
