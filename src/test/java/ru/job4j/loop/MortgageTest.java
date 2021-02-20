package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        int result = Mortgage.year(1000, 1200, 1);
        assertThat(result, is(1));
    }

    @Test
    public void when2Years() {
        int result = Mortgage.year(100, 120, 50);
        assertThat(result, is(2));
    }

    @Test
    public void when4Years() {
        int result = Mortgage.year(100, 70, 50);
        assertThat(result, is(4));
    }
}