package lab5;

public class IntTree{
	IntNode root;
	IntTree(){};
	class IntNode{
		int value;
		IntNode left;
		IntNode right;
		IntNode(int value){
			this.value = value;
		}
	}
	public void setRoot(int value){
		IntNode newNode = new IntNode(value);
		this.root = newNode;
	}
	public IntNode getRoot() {
		return root;
	}
	public boolean insert(int value) {
		IntNode newNode = new IntNode(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		else{
			
			IntNode temp=root;
			while(true) {
				if (newNode.value == temp.value) return false;
				if(newNode.value < temp.value) {
					if(temp.left == null) { 
						temp.left = newNode;
						return true;
					}
					else{
						temp = temp.left;
					}
				}
				else {
					
					if(temp.right == null) { 
						temp.right = newNode;
						return true;
					}
					else{
						temp = temp.right;
					}
				
				}
			}
		}
	}
	public int findMax() {
		IntNode temp = root;
		while(temp.right!=null) {
			temp=temp.right;
		}
		return temp.value;
	}
	
	
	private void printTree(IntNode root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "+-- ") + root.value);
            printTree(root.left, prefix + (isLeft ? "|   " : "    "), true);
            printTree(root.right, prefix + (isLeft ? "|   " : "    "), false);
        }
    }

    public void printTree() {
        printTree(root, "", false);
    }
    
	
}
