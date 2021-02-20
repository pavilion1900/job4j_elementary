package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int[] result = Square.calculate(3);
        int[] extected = new int[]{0, 1, 4};
        assertThat(result, is(extected));
    }

    @Test
    public void whenBound5Then014916() {
        int[] result = Square.calculate(5);
        int[] extected = new int[]{0, 1, 4, 9, 16};
        assertThat(result, is(extected));
    }
}