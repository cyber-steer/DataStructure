package week05;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(); 
		list.add(0, 300);  // 오토박싱으로 300은 Integer(300)으로 취급해준다
		list.add(0, 100);
		list.printAll();
		list.append(500);
		list.printAll();
		list.remove(2);
		list.printAll();
		list.append(700);
		list.printAll();
		list.remove(1);
		list.printAll();
	}
}
