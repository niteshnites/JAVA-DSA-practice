package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println(arrayList);

        arrayList.removeFirst();
        arrayList.removeLast();
        arrayList.remove(1);

        System.out.println(arrayList);

        // Add Two Array List Into One
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Print the original ArrayLists
        System.out.println("Original list1: " + list1);
        System.out.println("Original list2: " + list2);

        // Use addAll() to add all elements of list2 into list1
        list1.addAll(list2);
        System.out.println("Added List: " + list1);
    }
}
