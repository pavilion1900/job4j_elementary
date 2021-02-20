package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        LogicNot logic = new LogicNot();
        int number = -10;
        System.out.println("Число  " + number + " четное " + logic.isEven(number));
        System.out.println("Число  " + number + " положительное " + logic.isPositive(number));
        System.out.println("Число  " + number + " нечетное " + logic.notEven(number));
        System.out.println("Число  " + number + " отрицательное " + logic.notPositive(number));
        System.out.println("Число  " + number + " нечетное и положительное " + logic.notEvenAndPositive(number));
        System.out.println("Число  " + number + " четное или отрицательное " + logic.evenOrNotPositive(number));
    }
}
