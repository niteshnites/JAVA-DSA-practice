import com.beust.ah.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoTest {
    public static void main(String[] args) {

        // l1 = [1,2,3,4] l2 =[8,9,7,6] please add the elements in the list/array  with carry consideration
        // 1234
        // 8976
        //=========
        //102 10


        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(8);
        list1.add(9);
        list1.add(7);
        list1.add(6);

        int temp = 0;
        int carry;
        for (int i = list1.size()-1; i >= 0 ; i--) {
            for (int j = list2.size()-1; j >= 0; j--) {
                temp = list1.get(i) + list2.get(j); // 10
//                temp
//                carry = temp % 2; // 0

            }
        }







        int result1 = 0;

        for (int i = 0; i < list1.size(); i++) {
            result1 = result1 + list1.get(i);
        }

        int result2 = 0;

        for (int i = 0; i < list2.size(); i++) {
            result2 = result2 + list2.get(i);
        }

        // result
        System.out.println("Result Sum of all elements: " + (result1 + result2));

    }
}
