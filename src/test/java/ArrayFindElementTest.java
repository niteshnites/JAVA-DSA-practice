public class ArrayFindElementTest {
    public static void main(String[] args) {

        // From Integer Array {-2, 0, 4, 8, 15 ,20}
        // int input = 15: return 15
        // int input = 14: return 15
        // int input = 18: return 20

        int [] array = {-2, 0, 4, 8, 15 ,20};
        int input = 13;

        // O(n) Solution
        for (int i = 0; i < array.length; i++){
            if(array[i] == input){
                System.out.println("Found: " + input);
                break;
            }
            if(array[i]>input){
                System.out.println("Not Found Returning Next Number: " + array[i]);
                break;
            }
        }

        // O log(n) Solution
        int [] arr = {-2, 0, 4, 8, 15 ,20};
        int inp = 20;

        int left = 0;
        int right = arr.length-1;
        while(left <= right){
        int mid = left + (right-left)/2;
            if(arr[mid] == inp){
                System.out.println("Found: " + arr[mid]);
                break;
            } else if (arr[mid] < inp) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
    }
}
