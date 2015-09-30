/**
 * 
 */
package com.thinkinginjava.topic2;

/**
 * @author rajni.ubhi
 * 
 */
public class LinkedStack<T> {

	private Node<T> top = new Node<>();

	public void push(T element) {
		top = new Node(element, top);
	}

	public T pop() {
		T result = top.element;
		if(!top.end()) {
			top = top.next;
		}
		return result;
	}

	private static class Node<T> {
		private T element;
		private Node<T> next;

		/**
		 * 
		 */
		public Node() {
			// TODO Auto-generated constructor stub
			this.element = null;
			this.next = null;
		}

		public Node(T element, Node<T> next) {
			this.element = element;
			this.next = next;
		}

		boolean end() {
			return (element != null && next != null);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
