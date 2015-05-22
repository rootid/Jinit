package com.blocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Manager {


// some main method somewhere
    public static void main(String[] args) {
        BlockingQueue<Posts> queue = new ArrayBlockingQueue<Posts>(20);

        Thread a = new Thread(new Producer(queue));
        Thread b = new Thread(new Consumer(queue));
        a.start();
        b.start(); 
    }
}
