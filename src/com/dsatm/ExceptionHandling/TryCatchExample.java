package com.dsatm.ExceptionHandling;

public class TryCatchExample {
    static int performDivision(int x, int y){
        System.out.println("I am from division");
        int z=0;
        try {
            z=x/y;
            System.out.println("I am from this division");
        } catch (ArithmeticException e) {
            System.out.println("exception is caught");
        }

        return z;
    }

    static float performDivision(float a, float b){
        return a/b;
    }
}