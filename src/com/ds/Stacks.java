package com.ds;

import java.util.Stack;



class Stacks<Integer> {

   
    Stack<Integer> tStack;
    Stack <Integer> minStack;

    public void push(Integer data) {
        tStack.push(data);
        int minData = (java.lang.Integer) minStack.peek();
        int data1 = (java.lang.Integer) tStack.peek();
        if (minStack.isEmpty() ||  (minData <= data1) )  {
            minStack.push(data);
            
        }
    }

    public Integer pop() {
        if (!tStack.isEmpty()) {
            Integer data = tStack.peek();
            tStack.pop();
            if (data == minStack.peek() ) {
                minStack.pop();
            }
            return data;
        }
        return null;
    }

    public Integer min() {
        return minStack.peek();
    }

}
