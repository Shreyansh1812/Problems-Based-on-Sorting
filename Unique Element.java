import java.util.Arrays;

public class Main {

  
    static int findUnique(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }

    public static void main(String[] args) {
       
        int[] arr ={1,1,2,3,3,4,4}; 
        
      
        int uniqueElement = findUnique(arr);
        
        
        System.out.println("Unique element: " + uniqueElement);
    }
}
