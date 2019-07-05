package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SeriesTestParameterized {
    private int n;
    private int fibbonaciResult;
    private int p;
    private int sum;
    private Series series;

    public SeriesTestParameterized(int n, int fibbonaciResult, int p, int sum) {
        this.n = n;
        this.fibbonaciResult = fibbonaciResult;
        this.p = p;
        this.sum = sum;
    }

    @Before
    public void setUP(){
         series = new Series(n);
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        Integer[][] array = {{6, 8, 2,91},{9, 34,3,2025}};
        return Arrays.asList(array);
    }

    @Test
    public void fibonnaciComputeTest(){
        int actual = series.fibonnaciCompute();
        Assert.assertEquals(fibbonaciResult,actual);
    }

    @Test
    public void fibonnaciExecuteTest(){
        int actual = series.fibonacciExecute();
        Assert.assertEquals(fibbonaciResult,actual);
    }

    @Test
    public void sumOfPowersTest(){
        int actual = series.sumOfPowers(p);
        Assert.assertEquals(sum,actual);
    }
}
