package com.Threads.sequenceDisplay;

/**
 * There are n number of threads you need to print
 *  DeadLockThread1: 1
 *  DeadLockThread2: 2
 *  Thread3: 3
 *  Thread4: 4
 *  ...
 *  Threadn: n
 */


public class SequenceDisplayThread implements Runnable {

    ResourceLock resourceLock;
    Integer reminder;

    private final static Integer MAX_COUNT_NUM = 10;
    public SequenceDisplayThread(ResourceLock resourceLock, Integer reminder) {
        this.resourceLock = resourceLock;
        this.reminder = reminder;
    }

    @Override
    public void run() {
        synchronized (resourceLock) {
            while (resourceLock.getNumber() < MAX_COUNT_NUM) {
                while (resourceLock.getNumber() % resourceLock.getNumOfThreads() != reminder) {
                    try {
                        resourceLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + resourceLock.getNumber());
                resourceLock.incrementNumber();
                resourceLock.notifyAll();
            }
        }

    }
}
