package power;

public class PowerRecursion {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int power(int x, int y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;
		}
		return power(x, y - 1) * x;
	}

	public void printRes() {
		System.out.println(power(x, y));
	}
}
