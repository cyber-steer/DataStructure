package list;

public interface ListIterator<E> implements Iterator<Vertex>{
	private int index = 0;
	private int numVertices;
	private Vertex v[];
	public ListIterator() {
		LinkedList list = new LinkedList();
	}
	public boolean hasNext() {
		return index < numVertices;
	}
	public Vertex next() {
		return v[index++];
	}
}
