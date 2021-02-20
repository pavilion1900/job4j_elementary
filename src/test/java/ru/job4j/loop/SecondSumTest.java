package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SecondSumTest {

    @Test
    public void test1() {
        assertThat(SecondSum.sum(1, 2), is(1));
    }

    @Test
    public void test2() {
        assertThat(SecondSum.sum(1, 3), is(4));
    }

    @Test
    public void test3() {
        assertThat(SecondSum.sum(1, 4), is(4));
    }

    @Test
    public void test4() {
        assertThat(SecondSum.sum(1, 5), is(9));
    }

    @Test
    public void test5() {
        assertThat(SecondSum.sum(0, 6), is(12));
    }
}