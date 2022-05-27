

public class Test {
	public static void main(String[] args) throws Exception {
		Heap heap = new Heap(10);
		heap.insert(11);
		heap.insert(12);
		heap.insert(13);
		heap.insert(14);
		heap.insert(15);
		heap.insert(16);

		
		System.out.println(heap.root.data);
		System.out.println(heap.root.left.data);
		System.out.println(heap.root.right.data);
		System.out.println(heap.root.left.left.data);
		System.out.println(heap.root.left.right.data);
		System.out.println(heap.root.right.left.data);
		System.out.println(heap.root.right.right.data);
		
//		preorder(heap.root);
	}
	static public void preorder(TreeNode root) {
		if(root != null) {
			System.out.printf("%d ",root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
}
