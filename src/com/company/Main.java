package com.company;

import com.inheritence.If1;
import com.inheritence.InterafaceCheck;
import com.inheritence.base;

public class Main {

    public static void main(String[] args) {
        InterafaceCheck interafaceCheck = new InterafaceCheck();
        interafaceCheck.hi();

        If1 intf2 = new InterafaceCheck();
        intf2.hi();

        base b = new InterafaceCheck();
        b.fn();

    }
}
