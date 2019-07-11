package com.design.problems.AbstractFactory;

// There is a 3 browser IE, FireFox, Chrome. They have there own api. WAP to client need not worry about the browser
// and print the content

public class AbstractFactory {

    public static BrowserPrint getBrowserInstance(String btype) {
        BrowserPrint browser = null;
        switch (btype) {
            case "IE":
                browser =  new IEPrint();
                break;
            case "FF":
                browser = new FirefoxPrint();
                break;
            case "Chrome":
                browser = new ChromePrint();
                break;
            default :
                System.out.println("Not supported browser");
                break;
        }
        return browser;
    }
}
