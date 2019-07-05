package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeriesTest {
    private Series series;

    @Before
    public void setUp(){
        series = new Series(6);
    }

    @Test
    public void fibonnaciComputeTest(){
        int result = series.fibonnaciCompute();
        Assert.assertEquals(8,result);
    }

    @Test
    public void fibonnaciExecuteTest(){
        int result = series.fibonacciExecute(6);
        Assert.assertEquals(8,result);
    }

    @Test
    public void sumOfPowersTest(){
        int result = series.sumOfPowers(2);
        Assert.assertEquals(36,result);
    }
}
