package com.design.problems;

import com.design.problems.AbstractFactory.AbstractFactory;
import com.design.problems.AbstractFactory.BrowserPrint;

public class DesignMain {

    static void main(String args[]) {
        BrowserPrint browserPrint = AbstractFactory.getBrowserInstance("IE");
        browserPrint.printContent();
    }
}
