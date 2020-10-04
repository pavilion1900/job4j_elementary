package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num % 10 != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(12));
        System.out.println(sum(123));
        System.out.println(sum(1234));
        System.out.println(sum(12345));
    }
}