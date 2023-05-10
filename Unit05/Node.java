public class Node<T> {
    private T value;
    private Node<T> next;

    public Node (T value) {

        this.value = value;
        this.next = null;
    }   

    public T getValue() {
        return this.value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext (Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.value + " -> " + this.next;
    }

    public static void main(String[] args) {
        IntNode a = new IntNode(1);
        System.out.println(a);

        IntNode b = new IntNode (2);
        a.setNext(b);
        System.out.println(a);

        IntNode c = new IntNode (3);
        a.setNext(c);
        System.out.println(a);

        int length = Nodes.length(a);
        System.out.println("Length: " + length);

        int sum = Nodes.sum (a);
        System.out.println(sum);
    }
}
