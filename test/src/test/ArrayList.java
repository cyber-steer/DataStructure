package test;

public class ArrayList<E> implements ArrayListInterface<E>{
	private E[] items;
	private int point;
	
	public ArrayList(int n) {
		items = (E[]) new Object[n];
		point = 0;
	}
	@Override
	public void add(int index, E item) {
		if( index>point || index>=items.length || point == items.length) return;
		for(int i = items.length-1; i >index;i--) {
			items[i] = items[i-1];
		}
		items[index] = item;
		point++;
	}
	@Override
	public void append(E x) {
		if( point == items.length) return;
		items[point++] = x;
	}
	@Override
	public E remove(int index) {
		if(isEmpty() || index>point) return null;
		E item = items[index];
		for(int i=index;i<point-1;i++) {
			items[i] = items[i+1];
		}
		point--;
		return item;
	}
	@Override
	public boolean removeItem(E x) {
		for(int i=0;i<point;i++) {
			if(items[i] == x) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	@Override
	public E get(int i) {
		return items[i];
	}
	@Override
	public void set(int i, E x) {
		items[i] = x;
	}
	@Override
	public int indexOf(E x) {
		for(int i=0; i<point;i++) {
			if (items[i] == x) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public int len() {
		return point;
	}
	@Override
	public boolean isEmpty() {
		return point == 0;
	}
	@Override
	public void clear() {
		items = (E[]) new Object[items.length];
		point =0;
	}
	public void showArray(){
		System.out.print("[");
		for(int i=0;i < point;i++) {
			System.out.print(items[i] +", ");
		}
		System.out.println("]");
	}
	
	
	
}
