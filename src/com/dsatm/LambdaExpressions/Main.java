package com.dsatm.LambdaExpressions;

public class Main {
    public static void main(String[] args) {
//        ChildClass obj = new ChildClass();
//        obj.show();

        // Lambda Expression : Istatement is Functional interface
        // s is obj reference
        // show is implemented method
        IStatement s = () -> {
            return "KIRAN";
        };
        System.out.println(s.show());
    }
}
//Lambda expression help to eliminate to create object class and there is no need of implemented child class so i commented that file
// we eliminated lines of code and child class and creation of object