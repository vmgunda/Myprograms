package com.pattern;

public class SingletonPattern {

    private static volatile SingletonPattern _instance = null;
    private SingletonPattern() { }

    public static SingletonPattern getInstance() {
        if (_instance == null) {
            synchronized (SingletonPattern.class) {
                if(_instance == null) {
                    _instance = new SingletonPattern();
                }
            }
        }
        return _instance;
    }
}
