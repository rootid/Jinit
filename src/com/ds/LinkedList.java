package com.ds;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    class Node {
        String val;
        Node next;
    }

    Node head ;

    LinkedList () {
        head = null;
    }


    public Node getNode() {
        return head;
    } 

    public void addNodeToFront (String val) {
          Node tmpNode = new Node ();
          tmpNode.val = val;
          if ( head != null) {
        	tmpNode.next = head;
         }
        head = tmpNode;
        
    } 

    /*
     * Remove the duplicate node from the list using the extra pointer
     *
     */
    public Node removeDuplicate (Node ahead) {
        Set<String> uSet = new HashSet<String>();
        Node current = ahead;
        Node prev = null;
        while (current != null) {
            if (uSet.contains(current.val) ) {
                prev.next = current.next;
            } else {
                uSet.add(current.val);
                prev = current;
            }
            current = current.next;
        }
       // printListNode (prev);
        return ahead;
    }
    
    
    //n = 2 
    //1->5->7->8->10->null
    //2 pointer trick
    public static Node findNthNodetoLast (Node head,int n) {
        Node p1 = head;
        Node p2 = head;
        while ( n > 0) {
            if (p1 == null) {
                return null;
            }
            p1 = p1.next;
            n--;
        }
        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
       return p2; 
    }

    public static boolean deleteNode (Node n) {
        Node nxt = n.next;
        if (n == null || n.next == null) {
            return false;
        }
        if (n.next != null) {
            n.val = nxt.val;
            n.next = nxt.next;
        } 
        return true;

    }


    public void printList () {
        Node tmp = head;
        while (tmp != null) {
        	System.out.print(tmp.val + ",");
            tmp = tmp.next;
        }
        System.out.println("");
    }


    public static void printListNode (Node ahead) {
        Node tmp = ahead;
        while (tmp != null) {
        	System.out.print(tmp.val + ",");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    public static Node getLoopNode (Node head) {

        if (head == null || head.next == null) {
            return null;
        }
        Node s1 = head;
        Node s2 = head;
        
        while (s1.next != null ) {
            s1 = s1.next;
            s2 = s2.next.next;
            if (s1 == s2) {
                break;
            }
        }
         s1 = head;
        while (s1 != s2) {
            if (s2 == null || s2.next == null) {
                break;
            }
            s1 = s1.next;
            s2 = s2.next;
        }

        return s1;
    }


    //1->3->9->null
    //null<-1<-3<-9
    public static Node reverseLL (Node head) {
        Node current = head;
        Node next = null;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public static Node reverseLLHelper(Node prev,Node head) {
        if (head != null) {
            Node tmp = head.next;
            head.next = prev;
            reverseLLHelper (head,tmp);
        }
        return prev;

    }

    public static Node reverseLLRec (Node head) {
        return reverseLLHelper(null,head);
    }

    //l1 , l2
    //2->3->6->9->10->null
    //   5->8->|

    public static void main(String[] args) {
    
        LinkedList l = new LinkedList();
        l.addNodeToFront("Hi");
        l.addNodeToFront("Hi");
        l.addNodeToFront("Vi");
//        l.addNodeToFront("Welcome");
//        l.addNodeToFront("to");
//        l.addNodeToFront("of");
//        l.addNodeToFront("world");
//        l.addNodeToFront("of");
//        l.addNodeToFront("Matrix");
        l.printList();

        Node n = l.removeDuplicate(l.getNode() );
        printListNode (n);
    }

}
