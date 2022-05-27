package week12;

public class fact {
	public static void main(String[] args) {
		int n=4;
		System.out.println(factorial2(n));
	}
	public static double factorial(int n) {
		double fct=1;
		for(int i=n;i>0;i--) {
			fct *= i;
		}
		return fct;
	}
	public static double factorial2(int n) {
		if(n == 1)
			return 1;
		else {
			return n*factorial2(n-1);
		}
	}
}
