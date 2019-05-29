package com.company.Threads;

public class Resource {

    private int numberOfThreads;
    private int number = 1;
    private int maxNumberOfSequence;


    public int getMaxNumberOfSequence() {
        return maxNumberOfSequence;
    }


    public int getNumberOfThreads() {
        return numberOfThreads;
    }

    public int getNumber() {
        return number;
    }

    public int getIncrementNumber() {
        return number++;
    }

    public Resource(int numberOfThreads, int maxNumberOfSequence) {
        this.numberOfThreads = numberOfThreads;
        this.maxNumberOfSequence = maxNumberOfSequence;
    }
}
