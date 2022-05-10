package binomial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int m = inp.nextInt();
		
		BinomialRecursion binoR = new BinomialRecursion();		
		binoR.setN(n);
		binoR.setM(m);
		binoR.printRes();
	}

}
