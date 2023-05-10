public class BinaryNode {
    private int value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode getLeft () {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight () {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public String infixTraversal () {
        String string = "";
        if (left != null) {
            string += left.infixTraversal() + " ";
        }
        string += value + " ";
        if (right != null) {
            string += right.infixTraversal() + " ";
        }
        return string;
    }

    public boolean search (int target) {
        if (target == value) {
            return true;
        }
        if (left != null && left.search(target)) {
            return true;
        }

        if (right != null && right.search(target)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BinaryNode{value=" + this.value + ", left=" + left + ", right=" + right +"}";
    }
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(2);
        BinaryNode node3 = new BinaryNode(3);
        node3.setLeft(new BinaryNode(9));
        node3.setRight(new BinaryNode(4));
        root.setLeft(node3);
        BinaryNode node5 = new BinaryNode(5);
        node5.setLeft(new BinaryNode(1));
        root.setRight(node5);
        System.out.println(root);
        System.out.println(root.infixTraversal());
        System.out.println(root.search(9));
        System.out.println(root.search(2));
        System.out.println(root.search(7));
        System.out.println(root.search(8));
    }
}
