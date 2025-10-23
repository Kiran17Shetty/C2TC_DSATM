package com.dsatm.day4.ThirdPackage;

public class MyClass {

    private static MyClass obj= new MyClass();
    private int id;
    public int getId() {
        return id;

    }
    public void setId(int id) {
        this.id=id;
    }

    private MyClass() {
        System.out.println("MyClass Object is created");
    }

    private static MyClass getObj() {
        return obj;
    }
    @Override
    public String toString() {
        return "MyClass [id=" + id + "]";
    }

}