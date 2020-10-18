package ru.job4j.array;

import java.util.Arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
        }
        int num = 1;
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] += num;
                num++;
            }
        }
        System.out.println(Arrays.deepToString(triangle));
        return triangle;
    }
}