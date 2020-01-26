package com.sparta.ts;

public class CounterLooperInterfaceMethod implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("One " + SharedCounter.incrementCounter());
        }
    }
}
