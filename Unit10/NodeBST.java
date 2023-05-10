public class NodeBST implements BinarySearchTree {
    private BinaryNode root;
    private int size;


    public NodeBST () {
        root = null;
        size = 0;
    }

    @Override
    public void insert(int value) {
        if (root == null) {
            root = new BinaryNode(value);
        } else {
            bstInsert (root, value);
        }
        size++;
    }

    @Override
    public boolean search(int target) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (root != null) {
            return root.infixTraversal();
        } else {
            return "";
        }
    }

    private void bstInsert (BinaryNode node, int value) {
        if (value < node.getValue()) {
            if (node.getLeft() == null) {
                BinaryNode left = new BinaryNode(value);
                node.setLeft(left);
            } else {
                bstInsert(node.getLeft(), value);
        } 
    }   else { 
        if (node.getRight() == null) {
            BinaryNode right = new BinaryNode(value);
            node.setRight(right);
        } else {
            bstInsert(node.getRight(), value);
            }
        }
    }

    private boolean bstSearch (BinaryNode node, int target) {
        if (node == null) {
            return false;
        } else if (node.getValue() == target) {
            return true;
        } else if (node.getValue() < target) {
            bstSearch(node.getLeft(), target);
        } else {
            bstSearch(node.getRight(), target);
            }
        return false;
        }
    public static void main(String[] args) {
        // NodeBST bst = new NodeBST();
        // System.out.println(bst);

        // bst.insert(5);
        // bst.insert(4);
        // bst.insert(6);
        // bst.insert(2);
        // bst.insert(10);
        // System.out.println(bst);

        // System.out.println(bst.root);

        NodeBST pokedex = new NodeBST();
        System.out.println(pokedex);
        pokedex.insert (39); // Jiggly Puff
        pokedex.insert (4); // Charmander
        pokedex.insert (129); // Magikarp
        pokedex.insert (3); // Bulbasar
        pokedex.insert (132); // Ditto
        pokedex.insert (93); // Poison demon pokemon with arms :0
        pokedex.insert (1); // unevolved Bulbasar idk his name :(
        pokedex.insert (50); // Dig Dug
        pokedex.insert (51); // Dig Dug but it's three of them
        pokedex.insert(25); // Pikachu 

        System.out.println(pokedex.bstSearch(pokedex.root, 39)); // true
        System.out.println(pokedex.bstSearch(pokedex.root, 40)); // false
        System.out.println(pokedex.bstSearch (pokedex.root, 41)); // false
        System.out.println(pokedex.bstSearch(pokedex.root, 129)); // true

    }
}   

