package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int e1) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == e1) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
            if (el == data[i]) {
                result = i;
                break;
            }
        }
        return result;
    }
}
