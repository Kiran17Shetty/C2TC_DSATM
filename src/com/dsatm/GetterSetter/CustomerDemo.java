package com.dsatm.GetterSetter;

import java.util.Scanner;
public class CustomerDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name,productName;
        long phNo,amountPurchased;
        System.out.println("Enter the name of Customer:");
        name=sc.nextLine();
        System.out.println("Enter the Phone Number of Customer:");
        phNo=sc.nextLong();
        System.out.println("Enter the product name "+ name + " Purchased:");
        productName=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the amount of product:");
        amountPurchased=sc.nextLong();

        Customer c=new Customer();
        c.setName(name);
        c.setPhNo(phNo);
        c.setProductName(productName);
        c.setAmountPurchased(amountPurchased);
        System.out.println("Details of Customer:"+"\nCustomer Name:"+ name+"\nCustomer Phone number:"+ phNo + "\nProduct name:"+ productName+"\nAmount purchased:"+amountPurchased);
}
}
