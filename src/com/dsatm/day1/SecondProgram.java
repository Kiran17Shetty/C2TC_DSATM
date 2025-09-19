package com.dsatm.day1;

public class SecondProgram {
    public static void main(String[] args) {
        int a=10,b=9;
        double d= 20.1,f=8.2;

        System.out.println("Integer Division :"+(float)a/b);//implicit type casting(no data loss : widening)
        System.out.println("Integer Division :"+(double)a/f);
        System.out.println("Integer Division :"+(int)(d/f));// explicit type casting(data loss : shrinking)

        char Z='z';
        System.out.println("Ascii value by float:"+(float)Z);
        System.out.println("Ascii value by int:"+(int)Z);

    }
}
