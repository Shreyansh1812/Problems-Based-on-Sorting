import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

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

    static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> uniqueList = new ArrayList<>();
        if (arr.length == 0) return uniqueList;

        uniqueList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueList.add(arr[i]);
            }
        }
        return uniqueList;
    }

    private static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        List<Integer> uniqueList = removeDuplicates(arr);
        System.out.println("Array without duplicates: " + uniqueList);
    }
}
