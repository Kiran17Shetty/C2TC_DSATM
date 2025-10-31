package com.dsatm.Collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List l1 = new ArrayList(); // we have to implement interface through implemented class
        // ArrayList stores heterogeneous of data
        l1.add(05);
        l1.add(220);
        l1.add(true);
        l1.add(false);
        l1.add(20.5);
        l1.add("Kiran");
        l1.add(05);
        l1.add('a');
        l1.add(8,"kiran");
        System.out.println("List is" + l1);
        System.out.println("Is list contains 5?"+ l1.contains(5));
        l1.remove(01);// we have to give index not element
        System.out.println(l1);
        System.out.println(l1.get(02));
        System.out.println("Element removed : "+ l1.remove(05));
        l1.clear();
        System.out.println("List is : "+ l1);

        //Using generic we can create Homogeneos list
        List<String> names=new ArrayList<String>();
        names.add("Kiran");
        names.add("TNSIF");
        names.add("Navya");
        System.out.println("Array lit contains: " + names);
        // List does not conatin reverse method like names.reverse(), so we used Collections to use it
        Collections.reverse(names);
        System.out.println("Reversed List: "+ names);

        // To traverse the list
        System.out.println("----------- Traversing the list -------------");
        Iterator<String> it= names.iterator();
        System.out.println("Iterated Elements :");
        while(it.hasNext()){
            System.out.println( it.next());
        }


    }
}
