package utility;

import java.util.Arrays;

public class SearchingTechniques {

    // 1. Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // 2. Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // 3. Jump Search
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) return -1;
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // 4. Interpolation Search
    public static int interpolationSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            int pos = low + (target - arr[low]) * (high - low) / (arr[high] - arr[low]);

            if (arr[pos] == target) {
                return pos;
            } else if (arr[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }

    // 5. Exponential Search
    public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) return 0;

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i *= 2;
        }

        return Arrays.binarySearch(arr, i / 2, Math.min(i, arr.length), target);
    }

    // 6. Fibonacci Search
    public static int fibonacciSearch(int[] arr, int target) {
        int n = arr.length;
        int fibM2 = 0, fibM1 = 1;
        int fibM = fibM2 + fibM1;

        while (fibM < n) {
            fibM2 = fibM1;
            fibM1 = fibM;
            fibM = fibM2 + fibM1;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = Math.min(offset + fibM2, n - 1);

            if (arr[i] < target) {
                fibM = fibM1;
                fibM1 = fibM2;
                fibM2 = fibM - fibM1;
                offset = i;
            } else if (arr[i] > target) {
                fibM = fibM2;
                fibM1 -= fibM2;
                fibM2 = fibM - fibM1;
            } else {
                return i;
            }
        }

        if (fibM1 == 1 && offset + 1 < n && arr[offset + 1] == target) {
            return offset + 1;
        }

        return -1;
    }

    // Main method to test all search techniques
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);

        // Test Linear Search
        int linearResult = linearSearch(arr, target);
        System.out.println("Linear Search Result: " + (linearResult != -1 ? "Found at index " + linearResult : "Not Found"));

        // Test Binary Search
        int binaryResult = binarySearch(arr, target);
        System.out.println("Binary Search Result: " + (binaryResult != -1 ? "Found at index " + binaryResult : "Not Found"));

        // Test Jump Search
        int jumpResult = jumpSearch(arr, target);
        System.out.println("Jump Search Result: " + (jumpResult != -1 ? "Found at index " + jumpResult : "Not Found"));

        // Test Interpolation Search
        int interpolationResult = interpolationSearch(arr, target);
        System.out.println("Interpolation Search Result: " + (interpolationResult != -1 ? "Found at index " + interpolationResult : "Not Found"));

        // Test Exponential Search
        int exponentialResult = exponentialSearch(arr, target);
        System.out.println("Exponential Search Result: " + (exponentialResult >= 0 ? "Found at index " + exponentialResult : "Not Found"));

        // Test Fibonacci Search
        int fibonacciResult = fibonacciSearch(arr, target);
        System.out.println("Fibonacci Search Result: " + (fibonacciResult != -1 ? "Found at index " + fibonacciResult : "Not Found"));
    }
}

