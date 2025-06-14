package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(12,3,454,55,6,567,675,6,45,34,323,2232,32,23));

        int max = numbersList.stream().max(Integer::compareTo).get();
        System.out.println(max);
        int secondMax = numbersList.stream().filter(num -> num < max).max(Integer::compareTo).get();
        System.out.println(secondMax);

    }
}
