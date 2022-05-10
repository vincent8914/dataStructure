package gcd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int b = inp.nextInt();
		
		GcdRecursion gcdR = new GcdRecursion();
		gcdR.setA(a);
		gcdR.setB(b);
		gcdR.printRes();
	}

}
