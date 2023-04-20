package lab8genericspractice;

import java.util.*;

/**
 *
 * @author nicol
 */
import java.util.function.Consumer;

public class TestIterator<E> {

    private E[] ar;
    private int size;

    public TestIterator() {
        ar = (E[]) new Object[3];
    }

    public void add(E e) {
        ar[size++] = e;
    }

    public Iterator<E> iterator() {

        // use anonymous class, if there was only 1 method in the interface, we could have used a lambda expression
        Iterator<E> it = new Iterator<E>() {

            int index = 0; // this is an instance variable of the inner, anonymous class,
            // and can thus access the instance variables of the outer class, TestIterator<E>'s size variable

            @Override
            public boolean hasNext() {
                if (index < ar.length) {
                    return true;
                }
                return false;
            }

            @Override
            public E next() {
                return ar[index++];
            }

            @Override
            public void forEachRemaining(Consumer<? super E> action) { // this method takes a parameter of type Consumer ( Consumer is interface with one method, accept.)
                while (hasNext()) {
                    action.accept(next());
                }
            }
        };
        return it;
    }

    public static void main(String[] args) {
        TestIterator<Integer> te1 = new TestIterator();
        TestIterator<String> te2 = new TestIterator();

        te1.add(1);
        te1.add(2);
        te1.add(3);
        te2.add("one");
        te2.add("two");
        te2.add("three");

        Iterator<Integer> it1 = te1.iterator();
        Iterator<String> it2 = te2.iterator();
        Iterator<Integer> it3 = te1.iterator();

        while (it1.hasNext()) {
            System.out.print(it1.next() + "\t");
            it1.forEachRemaining(new Consumer<Integer>() {
                @Override
                public void accept(Integer t) {
                    System.out.print((t + 200) + "\t");
                }
            });
        }
        System.out.println("");

        while (it2.hasNext()) {
            System.out.print(it2.next() + "\t");
        }
        System.out.println("");

        it3.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.print((t * 2) + " ");
            }
        }
        );
        System.out.println("");
    }
}

class C {
    


}
