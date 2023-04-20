package lab8genericspractice;

/**
 *
 * @author nicol
 */
public class BinarySearch { // textbook p 292

    public static < E extends Comparable<E>> int binarySearch(E[] list, E key) {

        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key.compareTo(list[mid]) < 0) // previously if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid +1;
        }
        
        return (-low) - 1;
    }

    public static void main(String[] args) {

    }

}
