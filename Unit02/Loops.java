public class Loops {

    public static void printChars(String a_string) {
        System.out.println(a_string); // print (a_string)
        int length = a_string.length(); // len (a_string)
        int index = 0; // index = 0
        while (index < length) {
            char c = a_string.charAt(index); // c = a_string [index]
            System.out.println(index + " " + c);
            index += 1;
        }
    }

    public static void printCharsFor(String a_string) {
        System.out.println(a_string);
        for (int index=0; index<a_string.length(); index+=1) {
            char c = a_string.charAt(index);
            System.out.println(c);
        }
        
    }
        
    public static void main(String[] args) {
        printChars("Skywalker");

        for (int c=0; c<11; c++) {
            System.out.println (c);
        }
        // int n = 15;
        // int sum = 0;
        // int count = 0;
        // while (count <= n) {
        //     System.out.println(count);
        //     sum += count;
        //     count += 1;
        // }
        // System.out.println(sum);
    }
    
}
