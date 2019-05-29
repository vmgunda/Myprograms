package com.Threads.concurrent;

/**
 * Read write lock
 * 1. When write lock acquired all read lock should be wait
 * 2. When read lock acquired all the write lock should be wait
 *
 */
public class MyReadWriteLock {
    private int writers;
    private int writeRequest;
    private int readers;

    public synchronized  void  readlock() throws InterruptedException {
        while (writers > 0 || writeRequest > 0) {
            this.wait();
        }
        readers++;
    }

    public synchronized void readUnlock() {
        readers--;
        notifyAll();
    }

    public synchronized void writelock() throws InterruptedException {
        writeRequest++;
        while (writers > 0 || readers > 0) {
            this.wait();
        }
        writeRequest--;
        writers++;
    }

    public synchronized void writeUnlock() {
        writers--;
        notifyAll();
    }
}
