package ru.job4j.loop;

public class Symmetry {

    public static boolean check(int number) {
        String num = Integer.toString(number);
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1)) {
                return false;
            }
        }
        return true;
    }
}

