import java.util.LinkedList;
import java.util.Queue;

public class Heap implements HeapInterface{
	public TreeNode root;

	public Heap(int data) {
		root = makeNode(null, data, null, null);
	}
	@Override
	public void insert(int newItem) throws Exception {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(true) {
			TreeNode node = queue.poll();
			if(node.left == null) {
				TreeNode newNode = makeNode(null, newItem, null, node);
				node.left = newNode;
				sort(node);
				break;
			}
			else queue.add(node.left);
			if(node.right == null) {
				TreeNode newNode = makeNode(null, newItem, null, node);
				node.right = newNode;
				sort(node);
				break;
			}
			else queue.add(node.right);
		}
	}

	@Override
	public int deleteMax() throws Exception {
		return -123456;
	}

	@Override
	public int max() throws Exception {
		return -123456;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public void clear() {
		
	}
	
	private TreeNode makeNode(TreeNode r ,int d, TreeNode l, TreeNode p){
		TreeNode newNode = new TreeNode(r, d, l, p);
		return newNode;
	}
	private TreeNode sort(TreeNode node) {
		if(node != null) {
			if(node.left != null && node.left.data > node.data) {
				TreeNode left = node.left;
				if(node.left.left != null) {
					node.left.left.parent = node;
					node.left.left = node;
				}
				if(node.left.right != null) {
					node.left.right.parent = node;
					node.left.right = node.right;
				}
				if(node.parent != null ) {
					node.parent.left = left;
					node.left.parent = node.parent;
				}
				
				
				node.parent = node.right;
				node.right = left.right;
				node.left = left.left;
			}
			if(node.right != null && node.right.data > node.data) {
				TreeNode right = node.right;
				if(node.right.left != null) {
					node.right.left.parent = node;
					node.right.left = node.left;
				}
				if(node.right.right != null) {
					node.right.right.parent = node;
					node.right.right = node;
				}
				if(node.parent != null ) {
					node.parent.right = right;
					node.right.parent = node.parent;
				}
				
				
				node.parent = right;
				node.left = right.left;
				node.right = right.right;
			}
			return node;
		}
		else {
			return null;
		}
	}

}
