package week09;

public class BSTTest {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertBST('G');	bst.insertBST('I');
		bst.insertBST('H');	bst.insertBST('D');
		bst.insertBST('B');	bst.insertBST('M');
		bst.insertBST('N');	bst.insertBST('A');
		bst.insertBST('J');	bst.insertBST('E');
		
		System.out.println("\nBinary Search Tree");
		bst.printBST();
		System.out.println("Is There \"A\"? >>>");
		TreeNode t1 = bst.searchBST('A');
		if(t1 != null)
			System.out.printf("searching success!!! searched key : %c\n",t1.data);
		else {

			System.out.printf("searching faill!!! There is no : %c\n",t1.data);
		}
		t1 = bst.searchBST('Z');
		if(t1 != null)
			System.out.printf("searching success!!! searched key : %c\n",t1.data);
		else {

			System.out.printf("searching faill!!!\n");
		}
	}
}
