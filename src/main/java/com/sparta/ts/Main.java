package com.sparta.ts;

public class Main {
    public static void main(String[] args) {
        CounterLooperInterfaceMethod task = new CounterLooperInterfaceMethod();
        Thread thread = new Thread(task);
        CounterLooperClassMethod counterLooperClassMethod = new CounterLooperClassMethod();
        thread.start();
        counterLooperClassMethod.start();
    }
}

