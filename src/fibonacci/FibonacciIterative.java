package fibonacci;

public class FibonacciIterative {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
		System.out.println(fib(n));
	}

	private int fib(int n) {
		int res = 0;
		int temp1 = 0;
		int temp2 = 1;

		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		for (int i = 2; i <= n; i++) {
			res = temp1 + temp2;
			temp1 = temp2;
			temp2 = res;
		}

		return res;
	}
}
