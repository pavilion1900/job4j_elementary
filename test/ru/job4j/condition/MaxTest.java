package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        Max maximum = new Max();
        int out = maximum.max(1, 2);
        Assert.assertEquals(2, out);
    }

    @Test
    public void whenMax10To2Then10() {
        Max maximum = new Max();
        int out = maximum.max(10, 2);
        Assert.assertEquals(10, out);
    }

    @Test
    public void whenMax10To20Then20() {
        Max maximum = new Max();
        int out = maximum.max(10, 20);
        assertThat(out, is(20));
    }

    @Test
    public void whenMax10To10Then10() {
        Max maximum = new Max();
        int out = maximum.max(10, 10);
        Assert.assertEquals(10, out);
    }

    @Test
    public void whenMax40() {
        Max maximum = new Max();
        int out = maximum.max(10, 30, 40);
        Assert.assertEquals(40, out);
    }

    @Test
    public void whenMax50() {
        Max maximum = new Max();
        int out = maximum.max(50, 30, 40, 10);
        Assert.assertEquals(50, out);
    }
}