public class MiniPracticum5 {

    public static String reverse(String a_string) {
        int length = a_string.length();
        int count = 0;
        NodeStack<Character> stack_1 = new NodeStack<>();
        while (count < length) {
            stack_1.push(a_string.charAt(count)); 
            count++;
        }
        return stack_1.toString();
    }

    public static int [] noOdds(int [] an_array) {
        NodeStack<Integer> stack_1 = new NodeStack<>();
        int length = an_array.length;
        int count = 0;

        while (count < length) {
            if (an_array[count] % 2 == 0) {
                stack_1.push (Integer.valueOf(an_array[count]));
                count++;
            } else {
                count++;
            }
        }

        return an_array;   

    }
    
    public static void main(String[] args) {
        String a_string = "abc";
        System.out.println(reverse(a_string));
    }
}
