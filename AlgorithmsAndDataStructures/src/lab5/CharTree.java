package lab5;
public class CharTree {
	CharNode root;
	class CharNode{
		char value;
		CharNode left;
		CharNode right;
		CharNode(char value){
			this.value = value;
		}
	}
	public boolean insert(char value) {
		CharNode newNode = new CharNode(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		else{
			
			CharNode temp=root;
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
	public void setRoot(char value){
		CharNode newNode = new CharNode(value);
		this.root = newNode;
	}
	public CharNode getRoot() {
		return root;
	}

	private void printTree(CharNode root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "+-- ") + root.value);
            printTree(root.left, prefix + (isLeft ? "|   " : "    "), true);
            printTree(root.right, prefix + (isLeft ? "|   " : "    "), false);
        }
    }

    public void printTree() {
        printTree(root, "", false);
    }

	public void insertString(String word) {
    	for(char c: word.toCharArray()) {
    		insert(c);
    	}
    	
    }
}
