package com.corejava.examples;

import java.util.concurrent.*;

public class staticClss {

    public static String str;

    public staticClss() {
        str = "Hello";
    }

    public void print() {
        System.out.println("Static class:" + str);
        Future<String> submit = executorService.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "am doing fine";
            }
        });

        try {
            String s = submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    ExecutorService executorService = Executors.newSingleThreadExecutor();


}
