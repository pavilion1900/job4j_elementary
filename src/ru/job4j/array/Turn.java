package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (i < array.length - i - 1) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            } else {
                break;
            }
        }
        return array;
    }
}