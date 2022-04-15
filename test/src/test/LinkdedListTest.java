package test;

public class LinkdedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> node = new LinkedList<>();
		node.append(10);
		node.append(20);
		node.append(40);
		node.append(50);
		node.add(2,30);
		node.remove(2);
		node.add(2,30);
		node.removeItem(30);
		node.printAll();
		System.out.println(node.len());
	}
}
