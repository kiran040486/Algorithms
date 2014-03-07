package com.java.datastructures;

public class BinaryTree {
	
	private Node root;
	
    public BinaryTree(int data){
    	this.root = new Node(data);
    }
	
	public Node getRoot() {
		return root;
	}

	class Node{
		int data;
		Node lnode;
		Node rnode;
		
		public Node(){
			
		}
		public Node(int data){
			this.data = data;
			lnode = null;
			rnode = null;
		}
		
	}
	
	public void insert(Node node, int value) {
	    if (value < node.data) {
	      if (node.lnode != null) {
	        insert(node.lnode, value);
	      } else {
	        System.out.println("  Inserted " + value + " to left of "
	            + node.data);
	        node.lnode = new Node(value);
	      }
	    } else if (value > node.data) {
	      if (node.rnode != null) {
	        insert(node.rnode, value);
	      } else {
	        System.out.println("  Inserted " + value + " to right of "
	            + node.data);
	        node.rnode = new Node(value);
	      }
	    }
	  }
	
	public void printInOrder(Node node) {
	    if (node != null) {
	      printInOrder(node.lnode);
	      System.out.println("  Traversed " + node.data);
	      printInOrder(node.rnode);
	    }
	  }
	public void printPreOrder(Node node) {
	    if (node != null) {
	    	System.out.println("  Traversed " + node.data); 
	    	printInOrder(node.lnode);
	        printInOrder(node.rnode);
	    }
	  }
	public void printPostOrder(Node node) {
	    if (node != null) {
	      printInOrder(node.lnode);
	      printInOrder(node.rnode);
	      System.out.println("  Traversed " + node.data);
	    }
	  }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree btree = new BinaryTree(5);
		
		btree.insert(btree.root, 4);
		btree.insert(btree.root, 3);
		btree.insert(btree.root, 8);
		btree.insert(btree.root, 7);
		btree.insert(btree.root, 2);
		btree.printInOrder(btree.root);
		
		

	}

}
