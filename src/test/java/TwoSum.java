import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Finds two indices in the array such that their values add up to the target.
     *
     * @param nums   Array of integers
     * @param target Target sum
     * @return Array containing indices of the two numbers, or an empty array if no solution exists
     */
    public static int[] findTwoSum(int[] nums, int target) {
        // Map to store array values and their indices
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate complement

            // Check if the complement exists in the map
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }

            // Add the current number and its index to the map
            numToIndex.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        // Call the method and store the result
        int[] result = findTwoSum(nums, target);

        // Display the result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
