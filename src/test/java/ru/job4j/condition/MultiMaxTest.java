package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(100, 4, 2);
        assertThat(result, is(100));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenEquals() {
        int result = MultiMax.max(10, 10, 10);
        assertThat(result, is(10));
    }
}