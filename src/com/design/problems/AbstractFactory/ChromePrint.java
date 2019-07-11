package com.design.problems.AbstractFactory;

public class ChromePrint implements BrowserPrint {
    @Override
    public void printContent() {
        // delegate it to Chrome print method
        System.out.println("Printing Chrome");

    }
}
