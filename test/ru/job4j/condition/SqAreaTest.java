package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 6;
        int k = 2;
        double expect = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expect, out, 0.01);
    }

    @Test
    public void square1() {
        int p = 10;
        int k = 3;
        double expect = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expect, out, 0.01);
    }

    @Test
    public void square2() {
        int p = 17;
        int k = 4;
        double expect = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expect, out, 0.01);
    }
}