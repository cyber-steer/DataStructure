package week09;

public class LinkedTreeTest {
	public static void main(String[] args) {
		LinkedTree t = new LinkedTree();

//		TreeNode t7 = t.makeBT(null, 'D', null);
//		TreeNode t6 = t.makeBT(null, 'C', null);
//		TreeNode t5 = t.makeBT(null, 'B', null);
//		TreeNode t4 = t.makeBT(null, 'A', null);
//		TreeNode t3 = t.makeBT(t6, '/', t7);
//		TreeNode t2 = t.makeBT(t4, '*', t5);
//		TreeNode t1 = t.makeBT(t2, '-', t3);
		
		TreeNode t5 = t.makeBT(null, 'B', null);
		TreeNode t4 = t.makeBT(null, 'C', null);
		TreeNode t3 = t.makeBT(t4, '*', t5);
		TreeNode t2 = t.makeBT(null, 'A', null);
		TreeNode t1 = t.makeBT(t2, '+', t3);

		t.preorder(t1);
		System.out.println();
		t.inorder(t1);
		System.out.println();
		t.postorder(t1);
		
	}
}
