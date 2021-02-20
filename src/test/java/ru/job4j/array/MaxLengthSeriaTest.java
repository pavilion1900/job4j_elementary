package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLengthSeriaTest {

    @Test
    public void whenLength1Then1() {
        assertEquals(1, MaxLengthSeria.find(new int[]{1}));
    }

    @Test
    public void whenLength2Then1() {
        assertEquals(1, MaxLengthSeria.find(new int[]{2, 1}));
    }

    @Test
    public void whenLength2Then2() {
        assertEquals(2, MaxLengthSeria.find(new int[]{1, 2}));
    }

    @Test
    public void whenLength6Then4() {
        assertEquals(4, MaxLengthSeria.find(new int[]{1, 2, 0, 1, 2, 3}));
    }

    @Test
    public void whenLength6Expected4() {
        assertEquals(4, MaxLengthSeria.find(new int[]{1, 2, 1, 1, 2, 3}));
    }

    @Test
    public void whenLength3Then1() {
        assertEquals(1, MaxLengthSeria.find(new int[]{3, 2, 1}));
    }
}