package ru.job4j.loop;

public class Hello {
    public static void paint(int width, int height) {
        for (int row = 0; row <height; row++) {
            for (int cell=0; cell < width; cell++) {
                if
                ((row+cell) % 2 == 0) {
                    System.out.print("X");
                } else
                    {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
