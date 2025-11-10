package com.dsatm.PackageExecution.SecondPackage;

import com.dsatm.PackageExecution.FirstPackage.Base;

public class Excecutor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Base b2=new Base();
        b2.methodPublic();

        b2.varPublic=30;
        b2.methodPublic();

    }

}