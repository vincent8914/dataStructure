package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree bts = new BinarySearchTree();
		
		bts.insert(new Node(3));
		bts.insert(new Node(1));
		bts.insert(new Node(5));
		bts.insert(new Node(4));
//		bts.insert(new Node(2));
		bts.insert(new Node(9));
		bts.insert(new Node(8));
		bts.insert(new Node(10));
		bts.insert(new Node(6));
		bts.insert(new Node(0));
		bts.insert(new Node(-2));
		bts.insert(new Node(-1));
//		bts.insert(new Node(11));
		
		bts.display();
		
		System.out.println(bts.search(6));
		
		bts.delete(1);
		bts.display();
	}
}
