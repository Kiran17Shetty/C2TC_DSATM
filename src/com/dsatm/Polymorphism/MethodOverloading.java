package com.dsatm.Polymorphism;

public class MethodOverloading {
    public static int Addition(int a,int b) {
        return a+b;
    }
    public static int Addition(int a) {
        return a;
    }
    public static int Addition(int a,int b,int c) {
        return a+b+c;
    }

    public static float Addition(float a) {
        return a;
    }

}