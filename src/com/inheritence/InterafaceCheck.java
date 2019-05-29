package com.inheritence;

public class InterafaceCheck extends base implements If1, If2  {

    @Override
    public void hi() {
        System.out.println("Hi Interface is called Derived");
    }

    public void fn() {
        System.out.println("Derived class fn");
    }
}
