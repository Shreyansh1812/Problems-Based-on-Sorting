import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<Integer> find(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            // Ensure the element is in the range and not already in the correct place
            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Find duplicates
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                duplicates.add(arr[i]);
            }
        }

        return duplicates;
    }

    private void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = main.find(arr);
        System.out.println("Duplicates: " + duplicates);
    }
}
