package com.blocking;

import java.util.concurrent.BlockingQueue;


class Consumer implements Runnable {
	
    private BlockingQueue<Posts> queue;

    public Consumer(BlockingQueue<Posts> queue) {
      this.queue = queue;
    }
    
    public void run() {
       try {

          while(true) {
       	    Posts futurePost = queue.take(); // will wait for groomer!
            remove(futurePost);
          }	
       }
       catch(InterruptedException e) {
         // ahhh fooey.
       }
    }

	private void remove(Posts futurePost) {
		 System.out.println("Consuming");
		
	}
}
