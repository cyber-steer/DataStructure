import list.LinkedList;

public class Copy {
	public static void main(String[] args) {
		LinkedStack<Integer> a = new LinkedStack<Integer>(); 
		LinkedStack<Integer> b = new LinkedStack<Integer>();
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(40);
		a.push(50);
		LinkedStack<Integer> temp1 = new LinkedStack<Integer>();
		LinkedList<Integer> temp2 = new LinkedList<Integer>();
		while(a.top() != null) {
			temp1.push(a.pop());
		}
		while(temp1.top() != null) {
			temp2.append(temp1.pop());
		}
		for(int i=0; i<temp2.len();i++) {
			b.push(temp2.get(i));
		}
		

		
	}
}
