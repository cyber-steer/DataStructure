package test;

public class Node<E> {
	private E item;
	private Node<E> next;
	
	public Node(E items) {
		this.item = items;
	}
	public Node(E item, Node<E> next) {
		this.item = item;
		this.next = next;
	}
	public E getItem() {
		return item;
	}

	public void setItem(E items) {
		this.item = items;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
}
