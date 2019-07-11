package com.design.problems.AbstractFactory;

public class IEPrint implements BrowserPrint {
    @Override
    public void printContent() {
        System.out.println("Print Internet Explorer");
    }
}
