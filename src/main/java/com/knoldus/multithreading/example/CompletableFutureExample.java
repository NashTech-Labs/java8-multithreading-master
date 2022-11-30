package com.knoldus.multithreading.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {


    public void createCompletableFuture() throws InterruptedException,
            ExecutionException {
        CompletableFuture.runAsync(new Task()).get();
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello Task");

    }
}
