package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		System.out.println("���j�G");
		FactorialRecursion facR = new FactorialRecursion();
		facR.setN(n);
		
		System.out.println("�j��G");
		FactorialIterative facI = new FactorialIterative();
		facI.setN(n);
	}

}
