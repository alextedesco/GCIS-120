/** 
This file is a Nodes class that returns the length, sum, equality,
and a copy of linked node sequences. 
 @author Alex Tedesco
*/

public class Nodes {
    public static int length(IntNode node) {
/*
This method returns the length of an IntNode 
*/
        if (node == null) {
            return 0;
        } else {
            int length = 1;
            int rest = length (node.getNext());
            return length + rest;
        } 
    }

public static int sum(IntNode n) {
/*
This method returns the sum of an IntNode 
*/
    if (n == null) {
        return 0;
    } else {
        int me = n.getValue();
        IntNode rest = n.getNext();
        int sum = sum (rest);
        return me + sum;
        }
    }
public static Node<Character> stringToNodes(String string, int index) {
    // base case: how do we know when there are no more nodes to make
    // if index == length of string
    // return
    // make a node with a the character at the index
    
    // make the recursive call with index + 1

    // return the node we made connected to the node returned by the recursive call
    if (index >= string.length ()) {
        return null;
    } else {
        Node<Character> next = stringToNodes(string, index + 1);
        Node<Character> node = new Node<> (string.charAt(index));
        node.setNext(next);
        return node;
    }
}

public static boolean nodesEquals (Node<Integer> seq_1, Node<Integer> seq_2) {
/*
This method checks if two linked nodes are equal
*/
    if (seq_1.getValue() == null && seq_2.getValue() == null) {
        return true;
    } else {
        if (seq_1.getValue() == seq_2.getValue()) {
            return nodesEquals(seq_1.getNext(), seq_2.getNext());
        } else {
            return false;
        }
    }

}
public Node<Integer> copy (Node<Integer> node) {
/*
This method returns a copy of a node parameter.
*/
    if (node == null) {
        return null;
    } else {
        Node<Integer> new_node = new Node (node.getValue());
        new_node.setNext(copy(node.getNext()));
        return new_node;
    }
}
    
    public static void main(String[] args) {
        System.out.println(stringToNodes ("abc", 0));
        }
    }