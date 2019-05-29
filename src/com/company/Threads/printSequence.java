package com.company.Threads;

public class printSequence  implements Runnable {
    // Create a resource object which is used for the object sharing across the threads;

    private Resource resource;
    private int reminder;

    public printSequence(Resource resource, int reminder) {
        this.resource = resource;
        this.reminder = reminder;

    }

    @Override
    public void run(){
        // loop number of times
        while(resource.getNumber() < resource.getMaxNumberOfSequence()) {
            synchronized (resource) {
                while (resource.getNumber() % resource.getNumberOfThreads() != reminder) {
                    try {
                        resource.wait();
                    } catch (InterruptedException e) { }
                }
                System.out.println("Thread:  " + Thread.currentThread().getName() + "number: " + resource.getNumber());
                resource.getIncrementNumber();
                resource.notifyAll();
            }
        }
    }

    public static void main(String args[]) {
        Resource resource = new Resource(3, 10);

        Thread thread1 = new Thread(new printSequence(resource, 1), "DeadLockThread1");
        Thread thread2 = new Thread(new printSequence(resource, 2), "DeadLockThread2");
        Thread thread3 = new Thread(new printSequence(resource, 0), "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
