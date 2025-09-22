package com.dsatm.day3;
import java.util.Scanner;
public class PersonDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name,address;
        long phNo,aadhar;
        System.out.println("Enter the name of Person");
        name=sc.nextLine();
        System.out.println("Enter the Phone Number of Person");
        phNo=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the address of Person");
        address=sc.nextLine();
        System.out.println("Enter the aadhar of Person");
        aadhar=sc.nextLong();

        Person p=new Person();
        p.setName(name);
        p.setAddress(address);
        p.setPhNo(phNo);
        p.setAadhar(aadhar);
    }
}
