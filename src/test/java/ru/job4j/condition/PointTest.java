package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }


    @Test
    public void when01to23then2dot82() {
        double expected = 2.82;
        Point a = new Point(0, 1);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when46to89then5() {
        double expected = 5;
        Point a = new Point(4, 6);
        Point b = new Point(8, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to57then6dot4() {
        double expected = 6.4;
        Point a = new Point(0, 3);
        Point b = new Point(5, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}