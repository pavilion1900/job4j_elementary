package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OddCountTest {

    @Test
    public void countFrom1To2() {
        int result = OddCount.count(1, 2);
        assertThat(result, is(1));
    }

    @Test
    public void countFrom1To3() {
        int result = OddCount.count(1, 3);
        assertThat(result, is(2));
    }

    @Test
    public void countFrom1To4() {
        int result = OddCount.count(1, 4);
        assertThat(result, is(2));
    }

    @Test
    public void countFrom1To5() {
        int result = OddCount.count(1, 5);
        assertThat(result, is(3));
    }
}