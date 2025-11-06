package com.dsatm.JavaStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {
    public static void main(String[] args) {
        //Creating a stream from set of values
        Stream<Integer> stream = Stream.of(10,20,40,50,70,80,110);//Returns a sequential ordered stream

        //To count the number of elements
        //stream.count();// or we can use for each loop
        System.out.println("No of Elemets: "+ stream.count());

        Integer[] values = new Integer[] {10,20,30,10,11,23,5};
        //we cannot use the stream operations/filters directly to array so we need to create stream for that
        //creating stream from array
        stream = Arrays.stream(values);
        //System.out.println(stream);// not give output in formated way
        System.out.println("Squares of "+ Arrays.toString(values)+ " is as follows:");

        // 1st way
        //stream.map(num -> num*num).forEach(System.out::println);// it is lie normal sout statement(i used lambda expression to square every element)

        //2nd way in 2 lines for squaring(only one of the method we have to use, if we use both gives error)
        stream = stream.map(m -> m*m);
        stream.forEach((System.out::println));

        //print limit
        System.out.println("First 2 elements are : ");
        Arrays.stream(values).limit(2).forEach(System.out::println);

        // skip
        System.out.println("Elements excepts first 4 : ");
        Arrays.stream(values).skip(4).forEach(System.out::println);

        // distinct
        System.out.println("Distinct Elements are : ");
        Arrays.stream(values).distinct().forEach(System.out::println);

        List<String> words = Arrays.asList("Hello", "Stream", "Learning");
        //words.add("In Java"); Immutable list

        // creating a stream from a List
        Stream<String> stream1 = words.stream();

        // map
        System.out.println("Strings in uppercase : ");
        List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(s1);
        stream1 = words.stream();
        stream1.map(str->str.toLowerCase()).forEach(System.out::println);
        System.out.println(words);




    }
}
