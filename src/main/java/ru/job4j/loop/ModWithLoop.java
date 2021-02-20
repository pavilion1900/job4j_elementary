package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        return ((n / d) * d != n) ? n - (n / d) * d : 0;
//        int result = 0;
//        if ((n / d) * d != n) {
//            result = n - (n / d) * d;
//        }
//        return result;
    }

    public static void main(String[] args) {
        System.out.println(mod(4, 2));
        System.out.println(mod(3, 2));
        System.out.println(mod(8, 3));
        System.out.println(mod(0, 3));
    }
}
