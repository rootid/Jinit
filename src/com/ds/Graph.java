package com.ds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;


class GraphNode {
    
    Integer vx;
    private List<GraphNode> adjList;
    
    GraphNode (Integer aVx) {
        vx = aVx;
        adjList = new ArrayList<GraphNode> ();
    }
    
	private List<GraphNode> getAdjList() {
		return adjList;
	}
	
	

    //public static boolean isPathExistsHelper (GraphNode start
    //        ,GraphNode end,Set<GraphNode> visited,Stack<GraphNode> tStack) {

    //    if (!tStack.isEmpty()) {
    //        if (!visited.contains(tmp)) {
    //            visited.add(tmp);
    //            List<GraphNode> tmpList = tmp.getAdjList();
    //            for (GraphNode t : tmpList) {
    //                if (t.equals(end) )   {
    //                    return true;
    //                }
    //                return isPathExistsHelper (start,end,visited,tStack);
    //                //tStack.push(t);
    //            }
    //        }
    //    } else {
    //        return false;
    //    }
    //}



    
    public static boolean isPathExists (GraphNode start,GraphNode end) {
        
        //DFS
        Stack<GraphNode> tStack = new Stack<GraphNode>() ;
        Set<GraphNode> visited = new HashSet<GraphNode> ();
        tStack.push(start);

        while (!tStack.isEmpty()) {
            GraphNode tmp = tStack.pop();
            if (!visited.contains(tmp)) {
                if (tmp.equals(end) ) {
                    return true;
                }
                visited.add(tmp);
                List<GraphNode> tmpList = tmp.getAdjList();
                for (GraphNode t : tmpList) {
                    tStack.push(t);
                }
            }
        }
        return false;
    }



}
