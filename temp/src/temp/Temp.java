package temp;

import java.util.ArrayDeque;
import java.util.Deque;

public class Temp {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.offerFirst(2); // 앞에 추가 용량 초과시 false 리턴
		deque.addFirst(1); // 앞에 추가 용량 초과시 exception 발생
		deque.offerLast(3);	// 뒤에 추가 용량 초과시 false리턴
		deque.addLast(4); //뒤에 추가 용량 초과시 exception 발생
		System.out.println(deque);
		
		int item = deque.removeFirst(); // 비어있다면 excption 발생
		item = deque.pollFirst(); //비어있다면 false 반환
		deque.removeLast(); //비어있다면 exception발생
		deque.pollLast();
		System.out.println(item);
		
		System.out.println(deque.isEmpty());
		
    }
}
