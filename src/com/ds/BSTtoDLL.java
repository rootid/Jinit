
//Solution : The trick is to do inorder traversal while keeping track of the previous node. 
//Hint : validate BST 

//BinaryTreeToDLL(root,null);

void BinaryTreeToDLL(Node root,Node head){

  if(root == null)
    return;
    
  Node prev = null;

  BinaryTreeToDLL(root.left,head); //Visit first to left subtree
  
  if(prev == null) {
    head = root;        //Assign the left most node as head
  }
  else {
    root.left  = prev;     //connect left subtree to prev
    prev.right = root;     //connect prev right substree and root
  }

  prev = root;      ////Assign the left most node as root 

  if(root.right != null) {
    BinaryTreeToDLL(root.right,head);       //Visit right subtree
  }

}
