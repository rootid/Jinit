package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;


class AtomicCounter extends Counter {
  //  private int c = 0;
    private AtomicInteger c = new AtomicInteger(0);


    public void increment() {
       // c++;
      c.incrementAndGet();
    }

    public void decrement() {
       // c--;
    	  c.decrementAndGet();
    }

    public int value() {
       // return c;
        return c.get();
    }

}
