package com.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;


class TestJCF {

    public static void ListTest () {
    	
       PriorityQueue<String> pq = new PriorityQueue<String>();
       pq.offer("Hi");
       
       
       List<String>  list = new LinkedList<String> ();
    
       List<String> aList = new ArrayList<String> ();

       List<String> vList = new Vector<String> ();
       
       Stack<String> st = new Stack<>();
       
       String tempA [] = {"Hi","Hello","Test"};
       list.clear();    
       list.addAll(Arrays.asList(tempA));
       
       for (String str : list) {
           System.out.print(str + ",");
       }
       
       System.out.println();
       
       for (Iterator<String> it=list.iterator();it.hasNext();it.next()) {
           System.out.print(it + ",");    
       }
       
       System.out.println("");
        
       Object[] a = list.toArray();
       
    }

    public static void MapTest () {
        Map<String,String> mEditorMap = new HashMap<String,String>();
        mEditorMap.put ("CNN","R.Desai");
        mEditorMap.put ("NDTV","B.Du");
        mEditorMap.put ("Times Now","A.Go");

        Iterator iterator = mEditorMap.keySet().iterator();
        while (iterator.hasNext()) {
        	
           System.out.print(mEditorMap.get(iterator.next()) + ",") ;
           //iterator.remove();
           mEditorMap.put("TEST","R BKKK");
        }
        //System.out.println();
        //System.out.println(mEditorMap.get("NDTV"));
        
      
    }


    
    public static void main(String[] args) {
		
    	//ListTest();
    	MapTest();
	}


}
