package com.java.datastructures.test;

import com.java.datastructures.BinaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree btree = new BinaryTree(5);
		
		btree.insert(btree.getRoot(), 2);
		btree.insert(btree.getRoot(), 7);
		btree.insert(btree.getRoot(), 1);
		btree.insert(btree.getRoot(), 4);
		btree.insert(btree.getRoot(), 6);
		btree.printInOrder(btree.getRoot());
        //btree.printInOrderWoRec(btree.getRoot());
		System.out.println(">>>>>>>>>>>>>>");
        btree.printPreOrder(btree.getRoot());
        btree.printPostOrder(btree.getRoot());
		//btree.printLevel(btree.getRoot(), 3);
	}

}
