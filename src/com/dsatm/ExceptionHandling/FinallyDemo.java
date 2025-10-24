package com.dsatm.ExceptionHandling;
import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {// it is not mandatory try block always have catch block
            System.out.println("Enter the number:");
            int number=sc.nextInt();
            System.out.println(number%2==0? number+" is Even":number + " is Odd");
        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {// finally it is important to close the file, connections, even though exceptions not handled beacause otherwise it will deficult to memory management and garbage colletion
            System.out.println("In Finally....");
            sc.close();
        }

    }
}
