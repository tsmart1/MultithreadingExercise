package com.sparta.ts;

public class CounterLooperClassMethod extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Two " + SharedCounter.incrementCounter());
        }
    }
}
