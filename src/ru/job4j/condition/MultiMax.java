package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result;
        if (first >= second) {
            result = first >= third ? first : third;
        } else {
            result = second >= third ? second : third;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2, 3));
        System.out.println(max(1, 3, 2));
        System.out.println(max(3, 2, 1));
        System.out.println(max(3, 1, 2));
        System.out.println(max(2, 1, 3));
        System.out.println(max(2, 3, 1));
    }
}
