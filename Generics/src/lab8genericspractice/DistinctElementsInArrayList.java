package lab8genericspractice;

import java.util.*;

/**
 *
 * @author nicol
 */
public class DistinctElementsInArrayList {
    // Write the following method that returns a new ArrayList. 
    // The new list contains the non-duplicate elements from the original list.

    /**
     * The new list contains the non-duplicate elements from the original list
     *
     * @param <E> the type of the array
     * @param list the ArrayList to remove duplicates
     * @return a new ArrayList without duplicates
     */
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 2, 3}));
        System.out.println(ar1);

        ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList(new String[]{"a", "a", "b", "b"}));
        System.out.println(ar2);

        ArrayList<A> ar3 = new ArrayList<A>(Arrays.asList(new A[]{new A(2), new A(2)}));
        System.out.println(ar3);

        System.out.println(removeDuplicates(ar1));
        System.out.println(removeDuplicates(ar2));
        System.out.println(removeDuplicates(ar3));

    }

}

class A {

    int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "A{" + "x=" + x + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final A other = (A) obj;
        return this.x == other.x;
    }

}
