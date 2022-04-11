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
						// 將要刪除的node的root清除指標
						if (isLeft) {
							preNode.left = null;
						} else {
							preNode.right = null;
						}
						return;
					} else if (currentRoot.right != null) { // 找用來取代的node
						currentRoot.key = successor(currentRoot, preNode);
					} else {
						currentRoot.key = predecessor(currentRoot, preNode);
					}
					return;
				}
			}
			System.out.println("無此key!");
		}
	}

	private int successor(Node currentRoot, Node preNode) { // .right.最小的(left最底)
		preNode = currentRoot;
		currentRoot = currentRoot.right;
		boolean isLeft = false;
		while (currentRoot.left != null) {
			isLeft = true;
			preNode = currentRoot;
			currentRoot = currentRoot.left;
		}
		if (isLeft) { // 最後找到的node是left，它的root無須接任何東西
			preNode.left = null;
		} else { // 最後找到的node是root(底下無left)，它的root需接下它的right
			preNode.right = currentRoot.right;
		}
		return currentRoot.key;
	}

	private int predecessor(Node currentRoot, Node preNode) { // .left.最大的(right最底)
		preNode = currentRoot;
		currentRoot = currentRoot.left;
		boolean isRight = false;
		while (currentRoot.right != null) {
			isRight = true;
			preNode = currentRoot;
			currentRoot = currentRoot.right;
		}
		if (isRight) {
			preNode.right = null;
		} else {
			preNode.left = currentRoot.left;
		}
		preNode.left = currentRoot.left;
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
		System.out.print("\nPostorder：");
		postOrder(root);
//		System.out.println("\nBFS：");
//		BFS(root);
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

	private void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print("[" + root.key + "]");
		}
	}

//	private void BFS(Node root) {
//
//	}

}
