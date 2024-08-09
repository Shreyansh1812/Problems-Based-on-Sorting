import java.util.Arrays;

public class Main {

    // Sort the array using cyclic sort
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    // Find the missing number after sorting
    static int findMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i+1;
            }
        }
        return arr.length + 1; // If no number is missing, return n + 1
    }

    // Swap method to swap elements in the array
    private static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 6, 1}; // Missing number should be 5
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int missingNumber = findMissing(arr);
        System.out.println("Missing number: " + missingNumber);
    }
}
