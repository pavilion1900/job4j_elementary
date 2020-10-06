package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2, 1};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        assertThat(result, is(0));
    }

    @Test
    public void whenArrayHas50() {
        int[] input = {5, 4, 3, 2, 1};
        int value = 50;
        int result = FindLoop.indexOf(input, value);
        assertThat(result, is(-1));
    }
}