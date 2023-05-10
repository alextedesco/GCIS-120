import java.util.Arrays;

// Alex Tedesco

public class ArrayUtils {

    // arrayCopy (int [] array) {
    //     while (true); {
    //         int[] new_array = array;
    //         if (new_array.equals (array)) {
    //             break;
    //         }  
    //         return new_array;       
    //     }
    // }

    // int [] arrayReverse(int[] array) {
    //     System.out.println(array);
    //     for (int index=0; index < array.length; index+=1) {
    //         int size = array.length;
    //         int[] new_array = array [size];
    //     }
    //     return new_array;
    // }

    public static int[] rangeArray (int start, int stop) {
        int length = stop - start;
        int [] an_array = new int[length];
        for (int index=0; index < length; index++) {
            an_array[index] = start + index;
            }
        return an_array;
    }

public static void main(String[] args) {
    // ArrayUtils arrayUtils_1 = new ArrayUtils ();
    // int [] arrays = {1, 2, 3, 4};
    // System.out.println(arrayUtils_1.arrayCopy(arrays));
    // int[] array = rangeArray (5, 75);
    // System.out.println(Arrays.toString(array));
    System.out.println(Arrays.toString(rangeArray(5, 10)));
    }
}
