package ru.job4j.loop;

public class Cryptography {

    public static String code(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i <= sb.length(); i++) {
            if (sb.length() == 0) {
                sb = new StringBuilder("empty");
            } else if (sb.length() > 0 && sb.length() <= 4) {
                return sb.toString();
            } else if (sb.length() > 4 && i < sb.length() - 4) {
                sb.setCharAt(i, '#');
            }
        }
        return sb.toString();
    }
}

