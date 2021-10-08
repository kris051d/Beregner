package com.company;

public class Beregn {

    private  int sum;

    int arraySum(int[] a){
        //return a[0] + a[1] + a[2] + a[3];
        for (int i: a){

            sum += i;

        }
        return sum;
    }
}
