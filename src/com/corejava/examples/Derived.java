package com.corejava.examples;

public class Derived extends Base {

    public Derived() {

        this.str= "Venu";
    }

    @Override
    public void show() {
        System.out.println("Protected: " +this.str);

    }
}
