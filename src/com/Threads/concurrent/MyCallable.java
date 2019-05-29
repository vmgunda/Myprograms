package com.Threads.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        return null;
    }

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        java.util.concurrent.ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new MyCallable());
        Object o = future.get();
    }
}
