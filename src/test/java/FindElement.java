import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {
        // Creating a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Sample array of integers
        int[] arr = {12, 34, 54, 23, 56, 89, 10};

        // Ask the user to input the element to search for
        System.out.print("Enter the element to find: ");
        int target = scanner.nextInt();

        // Call the method to find the element in the array
        int index = findElement(arr, target);

        // Output the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }

    // Method to find the element in the array
    public static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}

