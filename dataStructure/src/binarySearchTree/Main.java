package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree bts = new BinarySearchTree();
		
		bts.insert(new Node(3));
		bts.insert(new Node(1));
		bts.insert(new Node(5));
		bts.insert(new Node(4));
		bts.insert(new Node(2));
		
		bts.display();
		System.out.println(bts.search(1));
		bts.delete(5);
		
		bts.display();
	}
}
