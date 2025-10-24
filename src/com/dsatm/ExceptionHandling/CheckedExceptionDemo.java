package com.dsatm.ExceptionHandling;

import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try{
            String str=CheckedException.acceptText();
            System.out.println(str);
        }catch(IOException e){
            System.out.println("An error occured while accepting string"+e.getMessage());
        }
    }
}
