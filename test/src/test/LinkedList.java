package test;

public class LinkedList<E> implements ArrayListInterface<E>{
	private Node<E> head;
	private int itemCount;

	public LinkedList() {
		itemCount = 0;
		head = new Node<E>(null, null);
	}
	@Override
	public void add(int index, E x) {
		Node<E> node = head;
		for(int i=0;i<index;i++) {
			node = node.getNext();
			if(node == null) return;
		}
		Node<E> newNode = new Node<E>(x, node.getNext());
		node.setNext(newNode);
		itemCount++;
	}

	@Override
	public void append(E x) {
		Node<E> node = head;
		while(node.getNext() != null) {
			node = node.getNext();
		}
		node.setNext(new Node<E>(x,null));
		itemCount++;
		
	}

	@Override
	public E remove(int index) {
		Node<E> node = head;
		for(int i=0;i<index;i++) {
			node = node.getNext();
			if(node == null) return null;
		}
		Node<E> returnNode = node.getNext();
		node.setNext(returnNode.getNext());
		itemCount--;
		return returnNode.getItem();
	}

	@Override
	public boolean removeItem(E x) {
		Node<E> node = head.getNext();
		while(node != null) {
			if(node.getNext().getItem() == x) {
				node.setNext(node.getNext().getNext());
				return true;
			}
			node = node.getNext();
		}
		return false;
	}

	@Override
	public E get(int index) {
		for(int i=0;i<index;i++) {
			
		}
		return null;
	}

	@Override
	public void set(int i, E x) {
		
	}

	@Override
	public int indexOf(E x) {
		return 0;
	}

	@Override
	public int len() {
		return itemCount;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public void clear() {
		
	}
	public void printAll() {
		Node<E> node = head.getNext();
		System.out.print("[");
		while(node != null) {
			System.out.print(node.getItem()+", ");
			node = node.getNext();
		}
		System.out.println("]");
	}

}
