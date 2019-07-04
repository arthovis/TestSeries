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
    private int q;
    private int fibcompute;
    private int fibexecute;
    private int p;
    private int number;
    private int sum;
    private Series series;

    public SeriesTestParameterized(int n, int q, int fibcompute, int fibexecute, int p, int number, int sum) {
        this.n = n;
        this.q = q;
        this.fibcompute = fibcompute;
        this.fibexecute = fibexecute;
        this.p = p;
        this.number = number;
        this.sum = sum;
    }

    @Before
    public void setUP(){
        Series series = new Series(n);
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        Integer[][] array = {{6, 8, 8, 21, 2, 1, 36},{9, 15, 34, 610,3, 1, 729}};
        return Arrays.asList(array);
    }

    @Test
    public void fibonnaciComputeTest(){
        int actual = series.fibonnaciCompute();
        Assert.assertEquals(fibcompute,actual);
    }

    @Test
    public void fibonnaciExecuteTest(){
        int actual = series.fibonacciExecute(q);
        Assert.assertEquals(fibexecute,actual);
    }

    @Test
    public void sumOfPowersTest(){
        double actual = series.sumOfPowers(p,number);
        Assert.assertEquals(sum,actual,0.01);
    }
}
