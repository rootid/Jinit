package com.concurrency;


class ThreadTest {

    private Counter counter;

    ThreadTest (Counter counter) {
        this.counter = counter;
    } 

    public Counter getcounter() {
    	return this.counter;
    }
    
    
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadTest tst = new ThreadTest(new AtomicCounter());

		ThreadTest tst1 = new ThreadTest(new Counter());
		
		for (int i=0;i<30;i++) {
			Thread t = new Thread(new CounterTaskInc(tst.getcounter()));
			t.start();
			//t.join();
			Thread t1 = new Thread(new CounterTaskDec(tst.getcounter()));
			t1.start();
			//t1.join();
		}

		Thread.sleep(2000);
		System.out.println(tst.getcounter().value());
		
	}
	


}
