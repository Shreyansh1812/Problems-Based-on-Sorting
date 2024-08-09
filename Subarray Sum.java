public class Main {
    static boolean findSubarrayWithTargetSum(int[] arr, int targetSum) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum == targetSum) {
                    System.out.println("Subarray found from index " + i + " to " + j);
                    return true;
                }
            }
        }
        
        return false;  
    }

    public static void main(String[] args) {
        int[] arr = {2,-3,4,-1,-2,1,5,-3};
        int targetSum = 07;

        if (findSubarrayWithTargetSum(arr, targetSum)) {
            System.out.println("Subarray with target sum found.");
        } else {
            System.out.println("No subarray with target sum found.");
        }
    }
}