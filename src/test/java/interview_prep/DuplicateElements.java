package interview_prep;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {

        // [1, 2, 2, 3, 1, 4]
        int [] numbers = {1, 2, 2, 3, 1, 4};

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : numbers) {
            set.add(num);
        }
        System.out.println(set);

        int [] numbers2 = {1, 2, 2, 13, 13, 4};

        for (int i = 0; i < numbers2.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (numbers2[i] == numbers2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(numbers2[i] + " ");
            }
        }

    }
}
