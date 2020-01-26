package com.sparta.ts;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter {
    //private static int counter;
    private static AtomicInteger counter = new AtomicInteger();

    public static AtomicInteger getCounter() { //formerly return int
        return counter;
    }

    public static int incrementCounter() { //formerly synchronized
        //return ++counter;
        return counter.incrementAndGet();
    }
}
