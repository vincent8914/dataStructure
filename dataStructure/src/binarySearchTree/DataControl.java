package binarySearchTree;

public interface DataControl {
	public void insert(Node insertNode);
	public void delete(int deleteKey);
	public boolean search(int searchKey);
	public void display();
}
