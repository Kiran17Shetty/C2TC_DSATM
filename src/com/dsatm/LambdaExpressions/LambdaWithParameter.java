package com.dsatm.LambdaExpressions;

public class LambdaWithParameter {
    public static void main(String[] args) {
        Message msg = (name) -> {
            System.out.println("Hello "+name);
        };
        msg.greet("Kiran");

        // For Cube Interface
        Cube c = (a) -> {
            return (a*a*a);
        };
        System.out.println("Cube value is: "+c.calculate(56));
    }



}
