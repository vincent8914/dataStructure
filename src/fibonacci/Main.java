package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		System.out.println("���j�G");
		FibonacciRecursion fibR = new FibonacciRecursion();
		fibR.setN(n);
		
		System.out.println("�j��G");
		FibonacciIterative fibI = new FibonacciIterative();
		fibI.setN(n);
	}

}
