package stack;

public class StackLinkedList {
	// ��@stack
	private Node stack;

	public boolean isEmpty() {
		if (stack == null)
			return true;
		else
			return false;
	}

	// �s�W
	public void push(Node newNode) {
		if (isEmpty() == true) {
			stack = newNode;
//			System.out.println("�}�l:\n�[�J���:" + newNode.data);
		} else {
			newNode.next = stack;
			stack = newNode;
//			System.out.println("�[�J���:" + newNode.data);
		}
	}

	// �R��
	public Node pop() {
		if (isEmpty() == true) {
			return null;
		}
		Node top = stack;
		stack = stack.next;
		return top;
	}

	public void display() {
		System.out.print("TOP// ");
		printAll(stack);
		System.out.println("//BOTTOM");
	}

	private void printAll(Node stack) {
		if (isEmpty() == true) {
			System.out.print("");
		} else if (stack.next != null) {
			System.out.print(stack.data + " ");
			printAll(stack.next);
		} else
			System.out.print(stack.data + " ");
	}
}
