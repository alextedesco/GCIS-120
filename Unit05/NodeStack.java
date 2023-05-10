import java.util.EmptyStackException;

public class NodeStack<T> {
    private Node<T> top;
    private int size;

    public NodeStack () {
        top = null;
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty () {
        return top == null;
    }

    public void push (T value) {
        // make a node with the value
        Node<T> node = new Node<>(value);

        // set the top to be the next after the new node
        node.setNext(top);

        // change the top to the new node
        top = node;

        // increment size
        size++;
    }

    public T peek () {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        // save the value at the top of a variable
        T saved_top = top.getValue();

        // move the top to the current top's next
        top = top.getNext();

        // decrement size
        size--;

        // return the value that you saved
        return saved_top;
    }

    @Override
    public String toString() {
        return "Stack{" + top + "}";
    }
    public static void main(String[] args) {
        NodeStack<String> stack = new NodeStack<>();
        System.out.println(stack);

        stack.push("abc");
        System.out.println(stack);
        stack.push("def");
        System.out.println(stack);
        stack.push("ghi");
        System.out.println(stack);
        stack.push("jkl");
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
