package temp;

class LeftHeapNode {
	int element, sValue;
	LeftHeapNode left, right;

	public LeftHeapNode(int ele) {
		this(ele, null, null);
	}

	public LeftHeapNode(int ele, LeftHeapNode left, LeftHeapNode right) {
		this.element = ele;
		this.left = left;
		this.right = right;
		this.sValue = 0;
	}
}

class LeftistHeap {
	private LeftHeapNode root;

	public LeftistHeap() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void clear() {
		root = null;
	}

	public void insert(int x) {
		root = merge(new LeftHeapNode(x), root);
	}

	public void merge(LeftistHeap rhs) {
		if (this == rhs)
			return;
		root = merge(root, rhs.root);
		rhs.root = null;
	}

	private LeftHeapNode merge(LeftHeapNode x, LeftHeapNode y) {
		if (x == null)
			return y;
		if (y == null)
			return x;
		if (x.element > y.element) {
			LeftHeapNode temp = x;
			x = y;
			y = temp;
		}

		x.right = merge(x.right, y);

		if (x.left == null) {
			x.left = x.right;
			x.right = null;
		} else {
			if (x.left.sValue < x.right.sValue) {
				LeftHeapNode temp = x.left;
				x.left = x.right;
				x.right = temp;
			}
			x.sValue = x.right.sValue + 1;
		}
		return x;
	}

	public int deleteMin() {
		if (isEmpty())
			return -1;
		int minItem = root.element;
		root = merge(root.left, root.right);
		return minItem;
	}

	public void inorder() {
		inorder(root);
		System.out.println();
	}

	private void inorder(LeftHeapNode r) {
		if (r != null) {
			inorder(r.left);
			System.out.print(r.element + " ");
			inorder(r.right);
		}
	}
}

public class Temp {

	public static void main(String[] args) {
		LeftistHeap lh = new LeftistHeap();
		lh.insert(5);
		lh.insert(1);
		lh.insert(4);
		lh.insert(2);
		lh.insert(3);
		System.out.println(lh.deleteMin());
		System.out.println(lh.deleteMin());
		System.out.println(lh.deleteMin());
		System.out.println(lh.deleteMin());
		System.out.println(lh.deleteMin());
	}
}