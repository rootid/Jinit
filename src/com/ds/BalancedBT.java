package com.ds;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BalancedBT {
    
    public static int getHeight (TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right) ) + 1;
    }
    

    public static boolean isBalanced (TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHt = getHeight(root.left);
        int rightHt = getHeight(root.right);

        if (Math.abs (leftHt - rightHt) > 1 ) {
            return false;
        }
        return isBalanced (root.left) && isBalanced(root.right);
    }


    public static TreeNode makeTreeHelper (TreeNode root,String s[]
            ,int start,int end) {

        if (start < end) {
            int mid = start + (end - start)/2;
            root = new TreeNode (s[mid]);
            TreeNode l = makeTreeHelper (root.left,s,start,mid-1);
            TreeNode r = makeTreeHelper (root.left,s,mid+1,end);
            return root;
        } else {
            return null;
        }

    }


    public static TreeNode makeTreeHelperGood (String s[]
            ,int start,int end) {

        if (start < end) {
            int mid = start + (end - start)/2;
            TreeNode root = new TreeNode (s[mid]);
            root.left = makeTreeHelperGood (s,start,mid-1);
            root.right = makeTreeHelperGood (s,mid+1,end);
            return root;
        } else {
            return null;
        }

    }

    public static TreeNode makeBalancedTree (String s[]) {
        TreeNode root = null;
        root = makeTreeHelper(root,s,0,s.length);
        return root;
    }

    public List< List<TreeNode> > makeListFromTree (TreeNode root) {

        Queue<TreeNode> tQ = new ArrayDeque <TreeNode> ();
        tQ.offer(root);
        int cV = 1;
        int nV = 0;
        List<List<TreeNode> > levelList = new ArrayList< List<TreeNode> >();
        List<TreeNode> list = new ArrayList<TreeNode> ();
        while ( !tQ.isEmpty () ) {
            TreeNode tmp = tQ.peek();
            
            if (tmp.left != null) {
                tQ.offer(tmp.left);
                nV++;
            }

            if (tmp.right != null) {
                tQ.offer(tmp.right);
                nV++;
            }
            
            tQ.poll();
            cV--;
         
            list.add(tmp);
            //Node tmpN = new Node (tmp.val);
            //if (head == null) {
            //    head = tmpN ;
            //} else {
            //    tmpN.next = head;
            //    head = tmpN;
            //}

            if (cV == 0) {
                cV = nV;
                levelList.add(list);
                list = new ArrayList<TreeNode>();
            }

        }
        return levelList;
    }


    public static TreeNode getLCA (TreeNode root,TreeNode t1,TreeNode t2) {
        
        if (!root) {
            return null;
        }

        if (t1 == root || t2 == root) {
            return root;
        }

        TreeNode leftN = getLCA (root.left,t1,t2);
        TreeNode rightN = getLCA (root.right,t1,t2);
        if (leftN != null && rightN != null) {
            return root;
        }

        if (leftN != null) {
            return leftN;
        }
        if (rightN != null) {
            return rightN;
        } 
        
        return null;
    }

}
