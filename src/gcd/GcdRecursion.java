package gcd;

public class GcdRecursion {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	private int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}

	public void printRes() {
		System.out.println(gcd(a, b));
	}
}
