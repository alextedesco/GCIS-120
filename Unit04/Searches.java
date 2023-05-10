public class Searches {

    public static int binarySearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        } else {
            int midpoint = (start - end) / 2;
            int value = array[midpoint];
            if (value == target) {
                return midpoint;
            } if (value > target) {
                int newStart = start;
                int newEnd = midpoint - 1;
                return binarySearch(array, target, newStart, newEnd);
            } else {
                int newStart = midpoint + 1;
                int newEnd = end;
                return binarySearch(array, target, newStart, newEnd);
            }
        }
    }
}
