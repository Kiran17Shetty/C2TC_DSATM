package com.dsatm.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCacheDemo {
    public static void main(String[] args) {
        System.out.println("I am in main method");
        int numberOne,numberTwo,numberThree;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        //while(true){
            try {
                numberOne= sc.nextInt();
                numberTwo=sc.nextInt();
                numberThree=numberOne/numberTwo;
                System.out.println("Division is :"+numberThree);
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, please give correct input");
            } catch (ArithmeticException e) {
                System.out.println("Exception caught :"+e.getMessage());
            } catch (Exception e) {
                //extra exception added to generally caught any other type of exception
                //if we write generalized exception 1st, then other exception its show error because other have no use already all exceptions are handled by generalized exception
                //why cant we generalized exception always because during big projec it is imp to know which type of exception occuring so based on that user be careful
                System.out.println("Exception caught :"+e.getMessage());
            }

        }
    }
//}
