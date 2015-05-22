package com.ds;

//  3  2  1
//  3  2 

class Queue<T> {

    class Node {
        T data;
        Node prev;
        Node next;
        Node (T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node front;
    private Node back;
    
    Queue () {
        this.front = null;
        this.back = null;
    }

    public void offer (T data) {
        Node tmp = new Node (data);
        if (this.front == null) {
            this.front = tmp;
            this.back = this.front;
        } else {
            tmp.next = this.front;
            this.front.prev = tmp;
            this.front = tmp;
        }
    }

    public T poll() {
        if (!isEmpty()) {
            Node tmp = this.back;
            T tmpData = (T)tmp.data;
            if (this.back == this.front) {
                this.back = null;
                this.front = null;
            } else {
                this.back = tmp.prev;
                tmp = null;
            }
            return tmpData ;
        }
        return null;
    }


    public T peek() {
        if (!isEmpty()) {
        	T tmpData = (T) this.back.data;
            return tmpData;
        }
        return null;
    }

    
    public boolean isEmpty() {
       if (front == null && back == null) {
           return true;
       }
       return false;
    }


    
    public static void main(String[] args) {

        Queue<String> tQ = new Queue<String> ();
        tQ.offer("Hi");
        tQ.offer("Hello");
        tQ.offer("Bye");
        System.out.println(tQ.peek());
        tQ.poll();
        System.out.println(tQ.peek());
        tQ.poll();
        System.out.println(tQ.peek());
        tQ.poll();
        System.out.println(tQ.peek());
        tQ.offer("Bye");
        System.out.println(tQ.peek());
    }
}
