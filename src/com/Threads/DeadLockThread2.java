package com.Threads;

public class DeadLockThread2 implements Runnable {

    Object lock1, lock2;
    public DeadLockThread2(Object lock1, Object lock2) {
        this.lock1=lock1;
        this.lock2=lock2;
    }

    @Override
    public void run() {
        synchronized (lock2) {
            System.out.println("DeadLockThread2: holding lock2");
            System.out.println("DeadLockThread2: Waiting for lock1");
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            synchronized (lock1) {
                System.out.println("DeadLockThread2: holding lock1");
            }
        }
    }
}
