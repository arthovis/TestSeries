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

    public int fibonacciExecute(int q){
        if(q==0 || q==1) return q;
        return fibonacciExecute(q-2)+fibonacciExecute(q-1);
    }

    public int sumOfPowers(int p){
        int number = 0;
        double sum = 0;
        while (number<=n){
             sum=+Math.pow(number,p);
            number++;
        }
        int result = (int) sum;
        return result;
    }



}

