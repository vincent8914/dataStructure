package stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();

		StackLinkedList stackLinkedList = new StackLinkedList();

		stackLinkedList.push(new Node("0"));
		stackLinkedList.push(new Node("1"));
		stackLinkedList.push(new Node("2"));
		stackLinkedList.push(new Node("3"));
		stackLinkedList.push(new Node("4"));
		stackLinkedList.display();
		System.out.println("POP: " + stackLinkedList.pop().data);
		stackLinkedList.display();
		stackLinkedList.push(new Node("6"));
		stackLinkedList.push(new Node("7"));
		stackLinkedList.display();
		System.out.println("POP: " + stackLinkedList.pop().data);
		System.out.println("POP: " + stackLinkedList.pop().data);
		System.out.println("POP: " + stackLinkedList.pop().data);
		System.out.println("POP: " + stackLinkedList.pop().data);
		System.out.println("POP: " + stackLinkedList.pop().data);
		System.out.println("POP: " + stackLinkedList.pop().data);
		System.out.println("POP: " + stackLinkedList.pop());
		stackLinkedList.display();
		stackLinkedList.push(new Node("8"));
		stackLinkedList.push(new Node("9"));
		stackLinkedList.push(new Node("AAA"));
		stackLinkedList.display();
	}

}
