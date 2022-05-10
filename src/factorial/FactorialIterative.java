package factorial;

public class FactorialIterative {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
		System.out.println(fact(n));
	}

	private int fact(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}

}
