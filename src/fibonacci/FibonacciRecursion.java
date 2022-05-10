package fibonacci;

public class FibonacciRecursion {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
		System.out.println(fib(n));
	}

	private int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

}
