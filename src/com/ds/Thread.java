package com.ds;

public class Thread  implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside other thread");
		
	}
	
	
	public static void main(String[] args) {
		
		
		new java.lang.Thread( new Thread()).start();;
		System.out.println("In the main thread");
	}

	
	
	
		
}
