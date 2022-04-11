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
				} else { // ���n�R����key�F
					if (currentRoot.left == null && currentRoot.right == null) {
						currentRoot = null;
						// �N�n�R����node��root�M������
						if (isLeft) {
							preNode.left = null;
						} else {
							preNode.right = null;
						}
						return;
					} else if (currentRoot.right != null) { // ��ΨӨ��N��node
						currentRoot.key = successor(currentRoot, preNode);
					} else {
						currentRoot.key = predecessor(currentRoot, preNode);
					}
					return;
				}
			}
			System.out.println("�L��key!");
		}
	}

	private int successor(Node currentRoot, Node preNode) { // .right.�̤p��(left�̩�)
		preNode = currentRoot;
		currentRoot = currentRoot.right;
		boolean isLeft = false;
		while (currentRoot.left != null) {
			isLeft = true;
			preNode = currentRoot;
			currentRoot = currentRoot.left;
		}
		if (isLeft) { // �̫��쪺node�Oleft�A����root�L��������F��
			preNode.left = null;
		} else { // �̫��쪺node�Oroot(���U�Lleft)�A����root�ݱ��U����right
			preNode.right = currentRoot.right;
		}
		return currentRoot.key;
	}

	private int predecessor(Node currentRoot, Node preNode) { // .left.�̤j��(right�̩�)
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
		System.out.print("Inorder�G");
		inOrder(root);
		System.out.print("\nPreorder�G");
		preOrder(root);
		System.out.print("\nPostorder�G");
		postOrder(root);
//		System.out.println("\nBFS�G");
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
