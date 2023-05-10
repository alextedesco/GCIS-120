/**
 * This file creates an ArrayStack with a type parameter.
 * @author Alex Tedesco
 */

// Imports
import java.util.Arrays;
import java.util.EmptyStackException;

    /**
    * This class creates an Array Stack
    */ 
public class ArrayStack<T> {
    private Object [] elements;
    private int size;

    public ArrayStack () {
        elements = new Object [3];
        size = 0;
    }

    /**
    * This method returns the size of the array.
    */ 
    public int size() {   
        return size;
    }

    /**
    * This methods returns true if the array is empty and false otherwise.
    */ 
    public boolean isEmpty () {   
        return size == 0;
    }

    /**
     * This methods pushes a value to the end of the Array Stack.
     * @param value The value being pushed to the end of the stack
     */
    public void push (int value) {

        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);      
        }
        elements [size] = value;
        size++;
    }

    /**
     * This methods returns the top value of the stack.
     */
    @SuppressWarnings ("unchecked")
    public T top () {
        try {
            return (T) elements[size - 1];
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack!");
        }
        return (T) elements[size - 1];
    }

    /**
     * This methods removes the top value of the stack.
     */
    @SuppressWarnings ("unchecked")
    public T pop () {
        T value = (T)elements[size - 1];
        try {
            elements[size - 1] = 0;
            return value;
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack!");
        }
        return value;
    }

@Override
public String toString() {
    /**
     * This methods returns the array in string format.
     */
    return "Stack{" + Arrays.toString(elements) + "}";
}


    /**
     * Main function with all executed code.
     */
   public static void main(String[] args) {
    ArrayStack<Integer> stack_1 = new ArrayStack();
    // System.out.println(stack_1);
    // System.out.println(stack_1.size());
    // System.out.println(stack_1.isEmpty());
    stack_1.push(3);
    System.out.println(stack_1);
    stack_1.push(2);
    System.out.println(stack_1);
    stack_1.push(1);
    System.out.println(stack_1);
    System.out.println(stack_1.size());
    System.out.println(stack_1.top());
    // ArrayStack stack_2 = new ArrayStack();
    // System.out.println(stack_2.top());
    System.out.println(stack_1.pop());
    System.out.println(stack_1);
   } 
}
