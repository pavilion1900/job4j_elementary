package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax10To20Then20() {
        int left = 10;
        int right = 20;
        int out = Max.max(left, right);
        assertThat(out, is(20));
    }

    @Test
    public void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}