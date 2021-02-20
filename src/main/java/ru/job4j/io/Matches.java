package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Вас приветствует игра 11");
        int matches = 11;
        int count = 1;
        while (matches > 0) {
            System.out.print("Ваш ход ");
            int select = Integer.valueOf(input.nextLine());
            if (select > 0 && select <= 3) {
                if (count % 2 == 1) {
                    System.out.println("Игрок №1 взял " + select + " спичку/спички");
                } else {
                    System.out.println("Игрок №2 взял " + select + " спичку/спички");
                }
                matches -= select;
                count++;
                System.out.println("Осталось " + matches + " спичек");
            } else {
                System.out.println("Неверное количество спичек");
            }
            if (matches == 0 && count % 2 == 0) {
                System.out.println("Игрок №1 выиграл");
            } else if (matches == 0 && count % 2 == 1) {
                System.out.println("Игрок №2 выиграл");
            }
        }
    }
}
