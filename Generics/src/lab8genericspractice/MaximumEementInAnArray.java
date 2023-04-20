package lab8genericspractice;

import java.util.*;

/**
 *
 * @author nicol
 */
public class MaximumEementInAnArray {
    /**
     *
     * @param <E>
     * @param list
     * @return
     */
    public static <E extends Comparable<E>> E max(E[] list) {
        
        if(list.length == 0){
            throw new RuntimeException("The length of the array cannot be zero");
        }
        if(list == null){
            throw new RuntimeException("The array cannot be null");
        }
        
        E max = list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i].compareTo(max) > 0){
                max = list[i];
            }
        }
        return max;
        
    }

    public static void main(String[] args) {

        Integer[] ar1 = {1, 2, 2, 3};
        System.out.println(ar1);

        String[] ar2 = {"a", "a", "b", "b"};
        System.out.println(ar2);

        B[] ar3 = {new B(1), new B(2)};
        System.out.println(ar3);

        System.out.println("---- MAX ----------");
        System.out.println(max(ar1));
        System.out.println(max(ar2));
        System.out.println(max(ar3));

    }

}

class B implements Comparable<B> {

    int x;

    public B(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "B{" + "x=" + x + '}';
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
        final B other = (B) obj;
        return this.x == other.x;
    }

    @Override
    public int compareTo(B o) {
        //return this.x - x;
        return this.x > o.x ? 1 : this.x == o.x ? 0 : -1;
    }

}
