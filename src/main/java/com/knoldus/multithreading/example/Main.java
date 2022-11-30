package com.knoldus.multithreading.example;

import java.util.concurrent.ExecutionException;

public class Main {

    /**
     * <a href="https://javasampleapproach.com/java/java-8/java-8-completablefuture-">...</a>
     * handle-exception
     *
     * @param args
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        CompletableFutureExample obj = new CompletableFutureExample();
        obj.createCompletableFuture();
    }
}