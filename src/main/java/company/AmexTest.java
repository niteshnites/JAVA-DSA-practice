package company;

import java.util.Scanner;

public class AmexTest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60}; // Sorted array

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int searchElement = scanner.nextInt();

        // Iterative Binary Search
        int index = binarySearchIterative(arr, searchElement);

        if (index != -1) {
            System.out.println(searchElement + " found at index " + index + " (O(log n))");
        } else {
            System.out.println(searchElement + " is not in the array.");
        }

        scanner.close();
    }

    // 🔥 Iterative Binary Search using Left, Right & Mid pointers - O(log n)
    private static int binarySearchIterative(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids overflow

            if (arr[mid] == key) {
                return mid; // Element found
            } else if (arr[mid] < key) {
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }
        return -1; // Element not found
    }
}
