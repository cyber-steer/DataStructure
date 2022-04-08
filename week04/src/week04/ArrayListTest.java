package week04;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(3);
		arr.append(10);
		arr.add(3, 30);
		arr.printAll();
	}
}
