package com.blocking;

import java.util.concurrent.BlockingQueue;


class Producer implements Runnable {

    private BlockingQueue<Posts> queue;

    public Producer(BlockingQueue<Posts> queue) {
    	this.queue = queue;
    }
    
    @Override
    public void run() {
       try {
         while(true) {
         	 queue.put(producePost());
         	
         }       
       }
       catch(InterruptedException e) {
           // we've interrupted your current broadcast to bring
       // you this important announcement...
       }
    }
    
    private Posts producePost() {
      System.out.println("Producing");
      Posts futurePost = new Posts();
      return futurePost;
    }

    
}
