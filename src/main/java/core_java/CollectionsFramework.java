package core_java;

import java.util.*;

public class CollectionsFramework {

    public static void main(String[] args) {
        // List Example - ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // List Example - LinkedList
        List<String> linkedList = new LinkedList<>(arrayList);
        linkedList.add("Date");
        System.out.println("LinkedList: " + linkedList);

        // Set Example - HashSet (Unordered, Unique elements)
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); // Duplicate ignored
        System.out.println("HashSet: " + hashSet);

        // Set Example - TreeSet (Sorted Order)
        Set<Integer> treeSet = new TreeSet<>(hashSet);
        treeSet.add(5);
        treeSet.add(30);
        System.out.println("TreeSet: " + treeSet);

        // Queue Example - PriorityQueue (Min Heap by default)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.add(30);
        System.out.println("PriorityQueue (Head Element): " + priorityQueue.peek());
        System.out.println("PriorityQueue: " + priorityQueue);

        // Deque Example - ArrayDeque (Efficient FIFO & LIFO)
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("First");
        arrayDeque.addLast("Last");
        arrayDeque.offer("Middle");
        System.out.println("ArrayDeque: " + arrayDeque);

        // Map Example - HashMap (Unordered Key-Value Pairs)
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);

        // Map Example - TreeMap (Sorted by Key)
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap (Sorted): " + treeMap);

        // Map Example - LinkedHashMap (Insertion Order Maintained)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 100);
        linkedHashMap.put("B", 200);
        linkedHashMap.put("C", 300);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Iterating over a List
        System.out.println("\nIterating over List:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Iterating over a Map
        System.out.println("\nIterating over Map:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

