
public class ArrayQueueTest {
	public static void main(String[] args) {
		ArrayQueue<Integer> aq = new ArrayQueue<>();
		
		aq.enqueue(100); aq.enqueue(200);
		aq.enqueue(300); aq.enqueue(400);
		aq.printAll();
		int data  = aq.dequeue();
		aq.printAll();
		System.out.println(data);
	}
}
