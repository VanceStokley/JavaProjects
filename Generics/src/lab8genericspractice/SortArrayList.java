package lab8genericspractice;

import java.util.*;

/**
 *
 * @author nicol
 */
public class SortArrayList {
    // Write the following method that returns a new ArrayList. 
    // The new list contains the non-duplicate elements from the original list.

    /**
     * The new list contains the non-duplicate elements from the original list
     *
     * @param <E> the type of the array
     * @param list the ArrayList to remove duplicates
     * @return a new ArrayList without duplicates
     */
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            E currentMin = list.get(i);
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(currentMin) < 0) {
                    currentMin = list.get(j);
                    min = j;
                }
            }
            if (min != i) {
                list.set(min, list.get(i));
                list.set(i, currentMin);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 2, 3}));
        System.out.println(ar1);

        ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList( new String[]{"a", "a", "b", "b"}));
        System.out.println(ar2);

       ArrayList<B> ar3 = new ArrayList<B>(Arrays.asList(new B[]{new B(2), new B(1)}));
        System.out.println(ar3);
        
        
        
        System.out.println("---- SORTED ----");
        sort(ar1);
        System.out.println(ar1);
        
        sort(ar2);
        System.out.println(ar2);
        
        sort(ar3);
        System.out.println(ar3);

    }

}


