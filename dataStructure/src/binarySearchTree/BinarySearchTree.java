package binarySearchTree;

public class BinarySearchTree implements DataControl{
	public Node root;

	@Override
	public void insert(int key) {
		Node insertNode = new Node(key);
		if(root != null) {
			Node currentNode = root;
			if(insertNode.key < currentNode.key) {
				currentNode = currentNode.left;
			}else {
				currentNode = currentNode.right;
			}
		}else {
			root = insertNode;
		}
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	


}
