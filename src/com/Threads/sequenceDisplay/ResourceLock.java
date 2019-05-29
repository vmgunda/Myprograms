
package com.Threads.sequenceDisplay;

public class ResourceLock {
    private Integer numOfThreads;
    private Integer number = 1;

    public ResourceLock(Integer threadCount) {
        this.numOfThreads = threadCount;
    }

    public Integer getNumOfThreads() {
        return numOfThreads;
    }

    public Integer getNumber() {
        return number;
    }
    public Integer incrementNumber() {
        return number++;
    }

}
