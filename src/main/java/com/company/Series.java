package com.company;

public class Series {
    private int n;

    public Series(int n) {
        this.n = n;
    }

    public int fibonnaciCompute(){
        if(n==0 || n==1) return n;
        int prevprevfib = 0;
        int prevfib = 1;
        int fib=0;
        for(int i=2;i<=n;i++){
            fib=prevprevfib+prevfib;
            prevprevfib=prevfib;
            prevfib=fib;

        } return fib;
    }

    public int fibonacciExecute(){
        if(n==0 || n==1) return n;
        return new Series(n-2).fibonacciExecute()+new Series(n-1).fibonacciExecute();
    }

    public int sumOfPowers(int p){
        int sum = 0;
        for(int i=1;i<=n;i++){
             sum+=Math.pow(i,p);
        }
        return sum;
    }



}

