package com.Threads.concurrent;

import java.util.LinkedList;
import java.util.List;

public class MyBlockingQueue<T> {
    List<T> queue = new LinkedList();
    int queueSize;

    public synchronized void enQueue(T item) {
        // if queue is full wait to get empty
        while (queue.size() >= queueSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(item);
        notifyAll();
    }

    public synchronized T deQueue() {
        // if queue is empty wait. else remove the item from the queue
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T t = queue.remove(0);
        notifyAll();
        return t;
    }
}
