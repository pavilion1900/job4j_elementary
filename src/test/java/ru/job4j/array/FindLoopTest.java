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

    @Test
    public void whenArrayHasValue5Then0() {
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] input = new int[]{5, 2, 10, 2, 7};
        int value = 70;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}