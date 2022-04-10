package binarySearchTree;

public class BinarySearchTree implements DataControl {
	public Node root;

	@Override
	public void insert(Node insertNode) {
		if (root == null) {
			root = insertNode;
		} else {
			Node currentRoot = root;
			while (true) {
				if (currentRoot.key > insertNode.key) {
					// linked-list
					if (currentRoot.left == null) {
						currentRoot.left = insertNode;
						break;
					} else
						currentRoot = currentRoot.left;
				} else {
					if (currentRoot.right == null) {
						currentRoot.right = insertNode;
						break;
					} else
						currentRoot = currentRoot.right;
				}
			}
		}
	}

	@Override
	public void delete(int deleteKey) {
		if (root == null) {
			System.out.println("isEmpty");
		} else {
			Node currentRoot = root;
			Node preNode = root;
			boolean isLeft = false;
			while (currentRoot != null) {
				preNode = currentRoot;
				if (currentRoot.key > deleteKey) {
					currentRoot = currentRoot.left;
					isLeft = true;
				} else if (currentRoot.key < deleteKey) {
					currentRoot = currentRoot.right;
					isLeft = false;
				} else { // 找到要刪除的key了
					if (currentRoot.left == null && currentRoot.right == null) {
						currentRoot = null;
						if(isLeft) {
							preNode.left = null;
						}else {
							preNode.right = null;
						}
						return;
					} else if (currentRoot.right != null) { // 找用來取代的node
						currentRoot.key = successor(currentRoot);
					} else {
						currentRoot.key = predecessor(currentRoot);
					}
					return;
				}
			}
			System.out.println("無此key!");
		}
	}

	private int successor(Node currentRoot) {// right.最小的
		Node preNode = currentRoot;
		currentRoot = currentRoot.right;
		while (currentRoot.left != null) {
			preNode = currentRoot;
			currentRoot = currentRoot.left;
		}
		preNode.left = currentRoot.right;
		return currentRoot.key;
	}

	private int predecessor(Node currentRoot) {// left.最大的
		Node preNode = currentRoot;
		currentRoot = currentRoot.left;
		while (currentRoot.right != null) {
			preNode = currentRoot;
			currentRoot = currentRoot.right;
		}
		preNode.left = currentRoot.right;
		return currentRoot.key;
	}

	@Override
	public boolean search(int searchKey) {
		if (root != null) {
			Node currentNode = root;
			while (currentNode != null) {
				if (searchKey < currentNode.key) {
					currentNode = currentNode.left;
				} else if (searchKey > currentNode.key) {
					currentNode = currentNode.right;
				} else {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void display() {
		System.out.print("Inorder：");
		inOrder(root);
		System.out.print("\nPreorder：");
		preOrder(root);
		System.out.println();
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print("[" + root.key + "]");
			inOrder(root.right);
		}
	}

	private void preOrder(Node root) {
		if (root != null) {
			System.out.print("[" + root.key + "]");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

}
