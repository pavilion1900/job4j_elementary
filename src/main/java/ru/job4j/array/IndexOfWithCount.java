package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int index = 0;
        for (int i = number; i < string.length; i++) {
            if (string[i] == c) {
                index = i;
            } else {
                index = -1;
            }
        }
        return index;
    }
}
