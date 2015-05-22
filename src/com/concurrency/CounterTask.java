package com.concurrency;

class CounterTaskInc implements Runnable {
        Counter counter; 
        
        CounterTaskInc (Counter counter) {
            this.counter = counter;
        } 

        @Override
        public void run() {
            for (int i=0;i<10;i++) {
                counter.increment();
            }
        }        
}


class CounterTaskDec implements Runnable {
    Counter counter; 
    
    CounterTaskDec (Counter counter) {
        this.counter = counter;
    } 

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            counter.decrement();
        }
    }        
}
