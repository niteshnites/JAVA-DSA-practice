package programs_basic;

public class ArraySort {
    public static void main(String[] args) {

        // Integer Array
        int [] array = {2,3,4,5,6,7,5,3,2,4,67};

        // Sort Integer Array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        // Print Sorted Array
        System.out.println("Sorted Array Elements: ");
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
