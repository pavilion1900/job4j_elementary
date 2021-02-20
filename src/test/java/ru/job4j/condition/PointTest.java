package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to1010then707() {
        Point a = new Point(5, 5);
        Point b = new Point(10, 10);
        double expected = 7.07;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when35to1015then1220() {
        Point a = new Point(3, 5);
        Point b = new Point(10, 15);
        double expected = 12.20;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3DThen1257() {
        Point a = new Point(3, 5, 10);
        Point b = new Point(10, 15, 7);
        double expected = 12.57;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3DThen5788() {
        Point a = new Point(23, 50, 100);
        Point b = new Point(1, 5, 71);
        double expected = 57.88;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}