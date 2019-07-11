package com.corejava.examples;

import java.util.Hashtable;
import java.util.LinkedList;

public class Derived extends Base {

    public Derived() {

        this.str= "Venu";
    }

    @Override
    public void show() {
        System.out.println("Protected: " +this.str);

    }

    public static void  main(String args[]) {
        Hashtable hashtable = new Hashtable();
        int k = new Integer(2);
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("B");
        ll.addFirst("C");
        ll.addLast("D");
        
        System.out.println("hi" + ll);
    }
}
