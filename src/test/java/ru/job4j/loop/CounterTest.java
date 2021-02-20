package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumFrom0To10() {
        int result = Counter.sum(0, 10);
        assertThat(result, is(55));
    }

    @Test
    public void sumFrom3To8() {
        int result = Counter.sum(3, 8);
        assertThat(result, is(33));
    }

    @Test
    public void sumFrom1To1() {
        int result = Counter.sum(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void sumByEvenFrom0To10() {
        int result = Counter.sumByEven(0, 10);
        assertThat(result, is(30));
    }

    @Test
    public void sumByEvenFrom3To8() {
        int result = Counter.sumByEven(3, 8);
        assertThat(result, is(18));
    }

    @Test
    public void sumByEvenFrom1To1() {
        int result = Counter.sumByEven(1, 1);
        assertThat(result, is(0));
    }
}