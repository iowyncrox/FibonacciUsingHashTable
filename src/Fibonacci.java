import java.util.HashMap;

public class Fibonacci {

	private static HashMap<Integer, Integer> dictionary = new HashMap<Integer, Integer>();

	static {
		dictionary.put(1, 0);
		dictionary.put(2, 1);
		dictionary.put(3, 1);
	}

	public static int getFib(int n) {

		if (n == 1)
			return 0;
		if (n == 2 || n == 3)
			return 1;
		
		if (dictionary.containsKey(n)) {
			System.out.println("Reading From Table");
			return dictionary.get(n);
		} else {
			int val = getFib(n - 1) + getFib(n - 2);
			dictionary.put(n, val);
			return val;
		}
	}

	public static void main(String[] args) {
		System.out.println(Fibonacci.getFib(8));
	}
}
