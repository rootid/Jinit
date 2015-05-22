package com.ds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class WFFrqComparator implements Comparator <WF> {

		@Override
		public int compare(WF first, WF second) {
			 return ( first.frequency - second.frequency);
		}
 }

class WF {

    //WF in sorted order
    Integer frequency;
    String word;

    WF () {
    	
    }

    public static void main () {
        List<WF> list = new ArrayList<WF>();
        list.add(new WF());
        Collections.sort(list,new WFFrqComparator());
    }

}


