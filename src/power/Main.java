package power;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int x = inp.nextInt();
		int y = inp.nextInt();
		
		PowerRecursion powR = new PowerRecursion();
		powR.setX(x);
		powR.setY(y);
		powR.printRes();
	}

}
