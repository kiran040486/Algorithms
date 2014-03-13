package com.java.datastructures;

import java.util.ArrayList;
import java.util.List;
/**
 * Basic Implementation of Stack
 * @author Kiran Kumar Kamisetty
 *
 */
public class Stack {

	private List<Integer> data;

	public Stack() {
		this.data = new ArrayList<Integer>();
	}

	public List<Integer> getData() {
		return data;
	}

	public void push(int elem) {
		getData().add(elem);

	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		return getData().remove(getData().size() - 1);
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		return getData().get(getData().size() - 1);
	}

	public boolean isEmpty() {
		if (getData().size() == 0)
			return true;
		return false;
	}

}
