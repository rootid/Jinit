package com.ds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



class Strings {

       public static Map<String,String> getStudentMap (String st []) {

           Map <String,String> uMap = new HashMap<String,String>();
           int idx = 0;
           for (String s : st) {
               uMap.put(s,String.valueOf(idx));
               idx++;
           }
           return uMap;
       }

       //strings
       public static boolean isUnique (String s) {
           int len = s.length();
           boolean result = true;
           for (int i=0;i<len-1;i++) {
                char c1 = s.charAt(i);
                for (int j = i+1;j<len;j++) {
                    char c2 = s.charAt(j);
                    if (c1 == c2) {
                        return false;
                    }
                }
           }
           return result;
       }


       public static String reverseString (String s) {
           int len = s.length();
           StringBuilder sb = new StringBuilder();
           for (int i=len-1;i>=0;i--) {
               sb.append(s.charAt(i));
           }
           return sb.toString();
       }

       public static boolean isAnagram (String s,String s1) {
           int len = s.length();
           int len1 = s1.length();
           if (len != len1) {
               return false;
           }
           char sArr[] = s.toCharArray();
           char sArr1[] = s1.toCharArray();
           Arrays.sort(sArr);
           Arrays.sort(sArr1);

           for (int i=0;i<len;i++) {
               if (sArr[i] != sArr1[i]) {
                   return false;
               }
           }
           return true;
       }

       //rrrteeeeeffg
       public static Character getFirstRepeatableChar (String s) {
           Character result = '\uffff';
           Set<Character> sSet = new HashSet<Character>();
           char sArr [] = s.toCharArray();
           for (char c : sArr) {
               if (sSet.contains(c)) {
                   return c;
               } else {
                   sSet.add(c);
               }
           }
           return result;
       }

       public static Character getFirstNonRepeatableChar (String s) {
           Character result = '\uffff';
           Map<Character,Integer> sMap = new HashMap<Character,Integer>();
           int len = s.length();
           for (int i=0;i<len;i++) {
               char c = s.charAt(i);
               if (sMap.containsKey(c)) {
                   sMap.put(c,2);
               } else {
                   sMap.put(c,1);
               }
           }
           for (int i=0;i<len;i++) {
               char c = s.charAt(i);
               if (sMap.get(c) == 1) {
                   return c;
               }
           }
           
           return result;
       }

       	
       public static boolean isSubstring (String s,String t) {
           Set<String> set = new HashSet<String> ();
           set.add(t);
           int slen = s.length();
           int tlen = t.length();
           for (int i=0;i< slen-tlen;i++) {
               if  ( set.contains(s.substring (i,i+tlen)) )  {
                   return true;
               }
           }
           return true;
       }
        //(i.e., “waterbottle” is a rotation of “erbottlewat”

       public static boolean isRotation (String s,String t) {
           int len1 = s.length();
           int len2 = t.length();
           if (len1 != len2) {
               return false;
           } 
           String ss = s + s;
           if (isSubstring(ss,t)) {
               return true;
           }
           return false;

       }

       //-----2 -d array in java

       public static void rotateBy90 (int a[][]) {
           int rLen = a.length;
           int cLen = a[0].length;

           //diagonal swaps
           for (int i=0;i<rLen-1;i++) {
               for (int j=0;j<cLen-1-i;j++) {
                   doSwap(a,i,j,cLen-1-j,rLen-1-i);
               }
           }

           //vertcal swaps
           for (int i=0;i<rLen/2;i++) {
               for (int j=0;j<cLen;j++) {
                   doSwap(a,i,j,rLen-1-i,j);
               }
           }
       }

       
      
       private static void doSwap(int[][] a, int i, int j, int k, int j2) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
    	   System.out.println(isAnagram ("logarithm","algorithm"));
    	   System.out.println(isAnagram ("Logarithm","Algorithm"));
    	   
    	   System.out.println(isUnique("BALMYU"));
    	   System.out.println(isUnique("BALMAYU"));
    	   
    	   System.out.println(reverseString("BALMYU"));
    	   System.out.println(reverseString("BALMAYU"));
    	   
    	   isRotation ("waterbottle","erbottlewat");
    	   
    	   System.out.println(getFirstNonRepeatableChar("BALMBAYLUMY"));
    	   
       
       }



}
