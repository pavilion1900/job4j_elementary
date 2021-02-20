package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (length - section >= 0) {
            length -= section;
            count += 1;
        }
        return count;
    }
}
