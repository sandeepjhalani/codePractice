package com.sandy.practice.datastructure;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class BinarySearchTree {

	TreeNode root = null;

	/*class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.getData() = data;
			this.getLeft() = null;
			this.getRight() = null;
		}
	}*/
	
	

	// creating a new node
	public TreeNode createTreeNode(int data) {
		return new TreeNode(data);
	}


	// searching the node in tree
	public TreeNode search(int val) {
		TreeNode trav = root;
		TreeNode parent = null;
		while (trav != null) {
			if (val == trav.getData())
				return trav;
			parent = trav;
			if (val < trav.getData())
				trav = trav.getLeft();
			else
				trav = trav.getRight();

		} // end of while
		parent = null;
		return null;
	}// end of search function

	// adding a new node
	public void addTreeNode(int data) {

		TreeNode newTreeNode = createTreeNode(data);
		if (root == null) {
			root = newTreeNode;
		} else {
			TreeNode trav = root;

			while (trav != null) {
				if (data < trav.getData()) {
					if (trav.getLeft() == null) {
						trav.setLeft(newTreeNode);
						trav = null;
					} else {
						trav = trav.getLeft();
					}
				} else {
					if (trav.getRight() == null) {
						trav.setRight(newTreeNode);
						trav = null;
					} else {
						trav = trav.getRight();
					}
				}
			}
		}

	}

	// adding a new node recursively
	private void addTreeNodeRecursively(TreeNode trav, int val) {
		if (val < trav.getData() && trav.getLeft() == null)
			trav.setLeft(new TreeNode(val));
		else if (val >= trav.getData() && trav.getRight() == null)
			trav.setRight( new TreeNode(val));
		else {
			if (val < trav.getData())
				addTreeNodeRecursively(trav.getLeft(), val);
			else
				addTreeNodeRecursively(trav.getRight(), val);
		}
	}

	// adding a new node recursively if root is null
	public void addTreeNode_Recursively(int val) {
		if (root == null)
			root = new TreeNode(val);
		else
			addTreeNodeRecursively(root, val);
	}

	// printing the tree in traversing type
	public void print(String type) throws EmptyListException {
		switch (type) {
		case "InOrder":
			inOrderPrint(root);
			break;
		case "InOrder1":
			inorder();
			break;
		case "PreOrder":
			preOrderPrint(root);
			break;
		case "PostOrder":
			postOrderPrint(root);
			break;
		default:
			System.out.println("Please give a valid type of Traversing!!!");
			break;
		}

	}

	// InOrder traversing
	public void inOrderPrint(TreeNode root) {
		if (root == null)
			return;
		inOrderPrint(root.getLeft());
		System.out.print(root.getData() + " ");
		inOrderPrint(root.getRight());
	}
	
	/*public void inorder() throws EmptyListException {
	        if (root == null) {
	            return;
	        }
	        
	        //keep the nodes in the path that are waiting to be visited
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        TreeNode node = root;
	         
	        //first node to be visited will be the left one
	        while (node != null) {
	            stack.push(node);
	            node = node.getLeft();
	        }
	         
	        // traverse the tree
	        while (stack.size() > 0) {
	           
	            // visit the top node
	            node = stack.pop();
	            System.out.print(node.getData() + " ");
	            if (node.getRight() != null) {
	                node = node.getRight();
	                 
	                // the next node to be visited is the leftmost
	                while (node != null) {
	                    stack.push(node);
	                    node = node.getLeft();
	                }
	            }
	        }
	    }*/
	
	public void inorder() throws EmptyListException {
        if (root == null) {
            return;
        }
        
        //keep the nodes in the path that are waiting to be visited
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode trav = root;
        
        while(true){
         if(trav!=null){
        	 stack.push(trav);
        	 trav=trav.getLeft();
        	
         }else{
        	if(stack.size()>0){
        		TreeNode popedValue =stack.pop();System.out.print(popedValue.getData()+" ");
        		if(popedValue.getRight()!=null){
        			trav=popedValue.getRight();
        		}
        	}
        	
         } 
        }
	}
	
	public void preorder() {
        if (root == null) {
            return;
        }
        
        //keep the nodes in the path that are waiting to be visited
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
		while (stack.isEmpty() == false) {
			TreeNode popedValue = stack.pop();
			System.out.print(popedValue.getData() + " ");

			if (popedValue.getRight() != null)
				stack.add(popedValue.getRight());
			if (popedValue.getLeft() != null)
				stack.add(popedValue.getLeft());
			
		}
    }
	
	//printLevelOrder of BST
     public void printLevelOrder()
    {
        if(root == null)
            return;
         
        Queue<TreeNode> q =new LinkedList<TreeNode>();
         
        q.add(root);
         
         
        while(true)
        {
             
            int nodeCount = q.size();
            if(nodeCount == 0)
                break;
           
            if(nodeCount > 0)
            {
                TreeNode trav = q.peek();
                System.out.print(trav.getData() + " ");
                q.remove();
                if(trav.getLeft() != null)
                    q.add(trav.getLeft() );
                if(trav.getRight() != null)
                    q.add(trav.getRight());
                nodeCount--;
            }
           // System.out.println();
        }
    }

	// PreOrder traversing
	public void preOrderPrint(TreeNode root) {

		if (root == null)
			return;
		System.out.print(root.getData() + " ");
		preOrderPrint(root.getLeft());
		preOrderPrint(root.getRight());
	}

	// PostOrder traversing
	public void postOrderPrint(TreeNode root) {

		if (root == null)
			return;
		postOrderPrint(root.getLeft());
		postOrderPrint(root.getRight());
		System.out.print(root.getData() + " ");

	}

}
