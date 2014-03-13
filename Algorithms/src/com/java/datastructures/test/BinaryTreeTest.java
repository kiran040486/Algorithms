package com.java.datastructures.test;

import com.java.datastructures.BinaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree btree = new BinaryTree(5);
		
		btree.insert(btree.getRoot(), 4);
		btree.insert(btree.getRoot(), 3);
		btree.insert(btree.getRoot(), 8);
		btree.insert(btree.getRoot(), 7);
		btree.insert(btree.getRoot(), 2);
		btree.printInOrder(btree.getRoot());

	}

}
