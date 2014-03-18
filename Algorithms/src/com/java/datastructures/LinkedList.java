package com.java.datastructures;

/**
 * Linked List Implementation
 * 
 * @author Kiran Kumar Kamisetty
 * 
 */
public class LinkedList {

	private LinkedListNode head;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

	public void add(int elem) {
		LinkedListNode node = new LinkedListNode(elem);
		if (head == null) {
			this.head = node;
			setSize(getSize() + 1);
		} else {
			node.next = head;
			head = node;
			setSize(getSize() + 1);
		}
	}

	public void addLast(int elem) {
		LinkedListNode node = new LinkedListNode(elem);
		if (head == null) {
			setSize(getSize() + 1);
			this.head = node;
		} else {
			LinkedListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			setSize(getSize() + 1);
		}
	}

	public void add(int elem, int index) {
		if (index > getSize()) {
			addLast(elem);
		}
		if (index == 0) {
			add(elem);
		}
		LinkedListNode node = new LinkedListNode(elem);
		int ind = 1;
		if (head == null) {
			this.head = node;
			setSize(getSize() + 1);
		} else {
			LinkedListNode temp = head;
			while (temp.next != null) {
				if (ind == index)
					break;
				temp = temp.next;
				ind++;
			}
			LinkedListNode temp2 = temp.next;
			temp.next = node;
			node.next = temp2;
			setSize(getSize() + 1);
		}
	}

	public void ListIterator() {
		LinkedListNode first = head;
		while (first != null) {
			System.out.println("Element is :" + first.data);
			first = first.next;
		}
	}

	public LinkedListNode reverse(LinkedListNode head) {
		LinkedListNode prev = null;
		LinkedListNode current = head;
		LinkedListNode next = current.next;

		while (true) {
			current.next = prev;

			if (next == null)
				break;

			prev = current;
			current = next;
			next = next.next;

		}

		return current;

	}

	public int findKfromLast(LinkedListNode head, int k) {

		if (head == null)
			return -1;

		if (k > this.getSize())
			return -1;

		int index = 0;

		LinkedListNode first = head;
		while (first.next != null) {
			if (index == k)
				break;
			first = first.next;
			index++;
		}

		LinkedListNode second = head;

		while (first.next != null) {

			first = first.next;
			second = second.next;

		}

		return second.data;

	}

	class LinkedListNode {
		int data;
		LinkedListNode next;

		public LinkedListNode(int n) {
			this.data = n;
		}
	}

}
