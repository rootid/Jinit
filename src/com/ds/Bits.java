package com.ds;


class Bits {

    public static boolean isOdd (int num) {
        return (num & 1) == 1;
    }


    public static boolean isPowerOfTwo (int num) {
        return (num & (num - 1) ) == 0;
    }


    public static boolean swapNumbers (int num,int num2) {
        return (num & (num - 1) ) == 0;
    }


    public static long multWith7(long num) {
        long result = num << 3;
        result = result - num;
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(isOdd(10));
        System.out.println(isOdd(9));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(15));
        System.out.println(isPowerOfTwo(7));
        System.out.println(multWith7(9));
    }
}
