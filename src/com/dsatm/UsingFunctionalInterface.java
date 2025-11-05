package com.dsatm;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display{
    static void show(String s){
        System.out.println("********"+s+"*********");
    }
    void show1(String s){
        System.out.println("********"+s+"*********");
    }
    String getName(){
        return "Kiran K G";
    }
}
public class UsingFunctionalInterface {
    public static void main(String[] args) {

        //consumer functional interface
        Consumer<String> consumer = (str) -> System.out.println("Welcome " + str);
        consumer.accept("Kiran");

        consumer = System.out::println; // method reference : instance inbuilt method
        consumer.accept("Geetha");

        consumer = Display::show;  // method reference : ststic method
        consumer.accept("Java Programming");

        consumer = new Display()::show1;
        consumer.accept("Hello");

//Supplier Functional interface
        Supplier<String> supplier = () -> "Hello from supplier";
        System.out.println(supplier.get());

        //Construcor Reference
        Supplier<Display> displaySupplier = Display::new;
        System.out.println(displaySupplier.get().getName());

        // Positie/Negatives number test
        Predicate<Integer> predicate = num -> num > 0;
        System.out.println(predicate.test(24));
        //System.out.println(supplier.get(-20)); // // Incorrect: Supplier does not take arguments

        //max test
        BiFunction<Integer, Integer, Integer> maxFunction = (x, y) -> x > y? x : y;
        System.out.println(maxFunction.apply(25, 14));

        BiFunction<String, Integer, String> printFunction = (name, num) -> name + num;
        System.out.println(printFunction.apply("Good Morning", 2));

    }

}
