package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean first = (ab + ac) > bc;
        boolean second = (ac + bc) > ab;
        boolean third = (ab + bc) > ac;
        return first && second && third;
    }
}
