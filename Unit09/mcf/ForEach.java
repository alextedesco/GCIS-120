package mcf;

public class ForEach {

    public static void forArray (String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    public static void forList (List<String> a_list) {
        for (String element : a_list) {
            System.out.println(element);
        }

    }

        public static void main(String[] args) {
            // String[] s = {"Hello", ",", "World", "!"};
            // forArray(s);

            ArrayList<String> array_list = new ArrayList<>();
            array_list.append("Hello");
            array_list.append("World");
            forList(array_list);

            // LinkedList<String> linked_list = new LinkedList<>();
            // linked_list.append("Hello");
            // linked_list.append("World");
            // forList(linked_list);
    }
}
