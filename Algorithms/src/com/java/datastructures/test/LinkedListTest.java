package com.java.datastructures.test;

import com.java.datastructures.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.addLast(6);
		list.addLast(8);
		list.addLast(10);
		list.add(4);
		list.add(5, 3);
		list.ListIterator();
		System.out.println("Size of the list is :"+list.getSize());
		//LinkedList list1 = new LinkedList();
		
		 //list1.setHead(list.reverse(list.getHead()));
		 
		 //list1.ListIterator();
		 
		System.out.println("kth element is"+ list.findKfromLast(list.getHead(), 2)); 
		
	}

}
