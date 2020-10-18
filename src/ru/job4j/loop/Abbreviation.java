package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        String sToUpperCase = s.toUpperCase();
        StringBuilder sb3 = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) != ' ') && (s.charAt(i) == sToUpperCase.charAt(i))) {
                sb3.append(s.charAt(i));
            }
        }
        return sb3.toString();
    }
}
