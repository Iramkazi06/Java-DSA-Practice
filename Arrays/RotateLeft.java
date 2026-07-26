package Arrays;
public class RotateLeft {
    public static void rotateLeftByOne(int[] arr) {
        // Edge case: If array is empty or has 1 element, no rotation needed
        if (arr == null || arr.length <= 1) return;
        
        // 1. Save the first element in a temporary variable
        int firstElement = arr[0];
        
        // 2. Shift all elements one position to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        // 3. Put the first element at the very end
        arr[arr.length - 1] = firstElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // 4. Print the array manually using a simple for loop
        System.out.print("Rotated Array: ");
        rotateLeftByOne(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Output: Rotated Array: 2 3 4 5 1 
    }
}

