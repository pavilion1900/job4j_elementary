package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i <= hours.length - 3) {
                if (hours[i] <= 8) {
                    salary += hours[i] * 10;
                } else if (hours[i] > 8) {
                    salary += (8 * 10) + (hours[i] - 8) * 15;
                }
            } else if (i > hours.length - 3) {
                if (hours[i] <= 8) {
                    salary += hours[i] * 10 * 2;
                } else if (hours[i] > 8) {
                    salary += (8 * 10 * 2) + (hours[i] - 8) * 15 * 2;
                }
            }
        }
        return salary;
    }
}
