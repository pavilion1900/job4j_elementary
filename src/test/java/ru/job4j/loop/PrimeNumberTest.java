package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int result = PrimeNumber.calc(5);
        assertThat(result, is(3));
    }

    @Test
    public void when11() {
        int result = PrimeNumber.calc(11);
        assertThat(result, is(5));
    }

    @Test
    public void when2() {
        int result = PrimeNumber.calc(2);
        assertThat(result, is(1));
    }
}