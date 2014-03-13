package com.java.datastructures.test;

import com.java.datastructures.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s1= new Stack();
		System.out.println("Element popped is :" + s1.pop());
		s1.push(2);
		s1.push(5);
		s1.push(6);
		s1.push(9);
		System.out.println("Element popped is :" + s1.pop());
		System.out.println("Element peeked is :" + s1.peek());
		
		
	}

}
