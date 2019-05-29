package com.Threads.sequenceDisplay;

public class ThreadSeqDisplayMain {

    public static void main(String args[]) {
        ResourceLock resourceLock = new ResourceLock(3);
        Thread T1 = new Thread(new SequenceDisplayThread(resourceLock,1), "DeadLockThread1");
        Thread T2 = new Thread(new SequenceDisplayThread(resourceLock,2), "DeadLockThread2");
        Thread T3 = new Thread(new SequenceDisplayThread(resourceLock,0), "Thread3");

        T1.start();
        T2.start();
        T3.start();
    }
}
