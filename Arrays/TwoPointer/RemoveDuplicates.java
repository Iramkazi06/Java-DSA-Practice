/*
Problem: Remove Duplicates from Sorted Array

Pattern: Two Pointer

Approach:
- Use two pointers:
  i -> points to the last unique element.
  j -> traverses the array.
- Whenever a new element is found, move i forward and copy the new element.

Time Complexity: O(n)
Space Complexity: O(1)
*/
package Arrays.TwoPointer;
public class RemoveDuplicates {

    public static int removeDuplicates(int[] a) {
        int i = 0;

        for (int j = 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] a = {1,1,2,2,3,4,4,5};
        System.out.print("Before Removing Duplicates: ");
for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
}
System.out.println(" ");        

            System.out.print("After Removing Duplicates: ");
            int k=removeDuplicates(a);//call of the function is stored in k coz the function returns the length of the array after removing duplicates
            for(int i=0;i<k;i++){//k is the length of the array after removing duplicates so we will print the array till k
            System.out.print(a[i] + " ");
}
        
    }
}

// leetcode problem 26
//solution
//Because the array is sorted, duplicates appear together.

//By comparing each element with the previous one, we can copy only unique elements forward using a second pointer.

//This allows us to remove duplicates in-place without extra memory.
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}