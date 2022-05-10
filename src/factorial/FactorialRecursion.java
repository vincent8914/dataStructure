package factorial;

public class FactorialRecursion {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
		System.out.println(fact(n));
	}

	private int fact(int n) {
		if (n == 1) {
			return n;
		}
		return n * fact(n - 1);
	}
}
