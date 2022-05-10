package sum;

public class SumRecursion {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	private int sum(int n) {
		if (n == 1)
			return 1;
		return sum(n - 1) + n;
	}
	
	public void printRes() {
		System.out.println(sum(n));
	}
}
