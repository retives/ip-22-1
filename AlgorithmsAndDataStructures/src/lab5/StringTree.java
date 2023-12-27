package lab5;

public class StringTree {
	class Node {
	    String data;
	    Node left, right;

	    public Node(String item) {
	        this.data = item;
	        left = right = null;
	    }
	}
	    private Node root;


	    private Node insert(Node root, String data) {
	        if (root == null) {
	            return new Node(data);
	        }

	        if (data.compareTo(root.data) < 0) {
	            root.left = insert(root.left, data);
	        } else if (data.compareTo(root.data) > 0) {
	            root.right = insert(root.right, data);
	        }

	        return root;
	    }

	    public void insert(String data) {
	        root = insert(root, data);
	    }

	    private void printTree(Node root, String prefix, boolean isLeft) {
	        if (root != null) {
	        	System.out.println(prefix + (isLeft ? "|-- " : "+-- ") + root.data);
	            printTree(root.left, prefix + (isLeft ? "|   " : "    "), true);
	            printTree(root.right, prefix + (isLeft ? "|   " : "    "), false);
	        }
	    }

	    public void printTree() {
	        printTree(root, "", false);
	    }

	    private int countNodesStartingWithLetter(Node root, char letter) {
	        if (root == null) {
	            return 0;
	        }

	        int count = 0;
	        if (root.data.charAt(0) == letter) {
	            count = 1;
	        }

	        count += countNodesStartingWithLetter(root.left, letter);
	        count += countNodesStartingWithLetter(root.right, letter);

	        return count;
	    }

	    public int countNodesStartingWithLetter(char letter) {
	        return countNodesStartingWithLetter(root, letter);
	    }

	    private Node deleteNodesStartingWithLetter(Node root, char letter) {
	        if (root == null) {
	            return null;
	        }

	        if (root.data.charAt(0) < letter) {
	            root.right = deleteNodesStartingWithLetter(root.right, letter);
	        } else if (root.data.charAt(0) > letter) {
	            root.left = deleteNodesStartingWithLetter(root.left, letter);
	        } else {
	            root = deleteNode(root, letter);
	            root = deleteNodesStartingWithLetter(root, letter); // рекурсивно видаляємо інші співпадаючі елементи
	        }

	        return root;
	    }

	    private Node deleteNode(Node root, char letter) {
	        if (root == null) {
	            return null;
	        }

	        if (root.data.charAt(0) == letter) {
	            return deleteNode(root);
	        }

	        root.left = deleteNode(root.left, letter);
	        root.right = deleteNode(root.right, letter);

	        return root;
	    }

	    private Node deleteNode(Node root) {
	        if (root.left == null) {
	            return root.right;
	        } else if (root.right == null) {
	            return root.left;
	        }

	        root.data = findMin(root.right).data;
	        root.right = deleteMin(root.right);

	        return root;
	    }
	    private Node findMin(Node root) {
	        while (root.left != null) {
	            root = root.left;
	        }
	        return root;
	    }

	    private Node deleteMin(Node root) {
	        if (root.left == null) {
	            return root.right;
	        }
	        root.left = deleteMin(root.left);
	        return root;
	    }

	    public void deleteNodesStartingWithLetter(char letter) {
	        root = deleteNodesStartingWithLetter(root, letter);
	    }
	}


