package sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();

		SumRecursion sumR = new SumRecursion();
		sumR.setN(n);
		sumR.printRes();
	}

}
