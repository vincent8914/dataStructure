package stack;

public class StackLinkedList {
	// 實作stack
	private Node stack;

	public boolean isEmpty() {
		if (stack == null)
			return true;
		else
			return false;
	}

	// 新增
	public void push(Node newNode) {
		if (isEmpty() == true) {
			stack = newNode;
//			System.out.println("開始:\n加入資料:" + newNode.data);
		} else {
			newNode.next = stack;
			stack = newNode;
//			System.out.println("加入資料:" + newNode.data);
		}
	}

	// 刪除
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
