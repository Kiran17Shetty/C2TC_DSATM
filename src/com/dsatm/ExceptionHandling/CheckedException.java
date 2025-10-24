package com.dsatm.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {// if we use throws it means it may throw error, it not means it handle the error
        static String acceptText() throws IOException {
            BufferedReader br;// it is used to read the data,character
            InputStreamReader isr= new InputStreamReader(System.in);// whatever user give input it is stred in isr
            br=new BufferedReader(isr);
            System.out.println("Enter the string:");
            String str= br.readLine();
            return str;
        }
}
