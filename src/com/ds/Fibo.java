package com.ds;

class Fibo {

    //F(n) = F(n-1) + F(n-2)
    public static long FiboRec (int n) {
        if (n < 0) {
            return -1;
        } 
        if (n == 0 || n == 1) {
            return n;
        }
        return FiboRec(n-1) + FiboRec(n-2);
    }
    
    public static void main(String[] args) {
		
	}

}
