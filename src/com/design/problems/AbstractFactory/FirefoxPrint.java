package com.design.problems.AbstractFactory;

public class FirefoxPrint implements BrowserPrint {

    @Override
    public void printContent() {
        // delegate to firefox print method
        //  Firefox.print() print method
        System.out.println("Priting FireFox");
    }
}
