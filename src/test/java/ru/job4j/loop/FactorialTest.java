package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialFor5() {
        int result = Factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialFor1() {
        int result = Factorial.calc(0);
        assertThat(result, is(1));
    }

    @Test
    public void whenCalculateFactorialForMinus10() {
        int result = Factorial.calc(-10);
        assertThat(result, is(0));
    }
}