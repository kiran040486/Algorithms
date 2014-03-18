package com.java.datastructures;

import java.util.Stack;

public class BinaryTree {

	private Node root;

	public BinaryTree(int data) {
		this.root = new Node(data);
	}

	public Node getRoot() {
		return root;
	}

	class Node {
		int data;
		Node lnode;
		Node rnode;

		public Node() {

		}

		public Node(int data) {
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

	public int height(Node node) {

		if (node == null)
			return 0;
		int lh = height(node.lnode);
		int rh = height(node.rnode);

		return 1 + Math.max(lh, rh);

	}

	int diameter(Node root) {
		if (root == null)
			return 0;

		int lheight = height(root.lnode);
		int rheight = height(root.rnode);

		int ldia = diameter(root.lnode);
		int rdia = diameter(root.rnode);

		return Math.max(1 + lheight + rheight, Math.max(ldia, rdia));
	}

	public void printInOrderWoRec(Node root) {

		Node current = root;
		Stack<Node> stack = new Stack<Node>();
		while (true) {

			if (current != null) {
				stack.push(current);
				current = current.lnode;

			} else {
				if (!stack.isEmpty()) {

					Node temp = stack.peek();
					stack.pop();
					System.out.println("Element traversed is:" + temp.data);
					current = temp.rnode;

				} else {
					break;
				}

			}

		}

	}
	
	public void printLevel(Node root, int k)
	{
	    if(root == null)
	        return;

	    if(k == 1)
	    {
	        System.out.println("Data at level is :"+root.data);
	    	
	        return;
	    }

	    printLevel(root.lnode, k-1);
	    printLevel(root.rnode, k-1);
	}

}
