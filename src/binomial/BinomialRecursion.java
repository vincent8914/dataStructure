package binomial;

public class BinomialRecursion {
	private int n;
	private int m;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	private int bino(int n, int m) {
		if (n == m || m == 0) {
			return 1;
		}
		return bino(n - 1, m) + bino(n - 1, m - 1);
	}

	public void printRes() {
		System.out.println(bino(n, m));
	}
}
