import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingTest {

    public static void main(String[] args) {

        // [ 1, 2, 3, 4, 5, 6 ] ----> [6,1, 2, 3, 4, 5] -----> [5, 6, 1, 2, 3, 4]
        int array [] = {1, 2, 3, 4, 5, 6};
        List<Integer> aList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < array.length-1; i++) {
            aList.add(i);
        }
        // delete node
        for (int i = aList.size()-1; i > 0; i--) {
            for (int j = 0; j < aList.size(); j++) {
                if(i == aList.get(j)) {
                    newList.add(i);
                    break;
                }
            }
            for (int z = 0; z < aList.size()-1; z++) {
                newList.add(z);
            }
            System.out.println(newList);
        }
        // insert first
        // shift


    }
}
