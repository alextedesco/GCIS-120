public class StringNode {
    private String value;
    private StringNode next;

    public StringNode (String value) {

        this.value = value;
        this.next = null;
    }   

    public String getValue() {
        return this.value;
    }

    public StringNode getNext() {
        return this.next;
    }

    public void setNext (StringNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.value + " -> " + this.next;
    }

    public static void main(String[] args) {
        StringNode x = new StringNode ("abc");
        StringNode y = new StringNode ("def");
        x.setNext (y);
        StringNode z = new StringNode ("ghi");
        y.setNext(z);

    }
}
