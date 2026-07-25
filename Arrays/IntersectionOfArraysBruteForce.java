package Arrays;
import java.util.*;
/**
 * IntersectionOfArraysBruteForce
 */
public class IntersectionOfArraysBruteForce {
public static void Intersection(int[]nums1,int[]nums2){

//Acts like a sticky note this should be zero in order to add elements
// 1. Create the tracker array 
int []visited=new int[nums2.length];//Currently consistes 0 

    ArrayList<Integer>list=new ArrayList<>();

    for(int i=0;i<nums1.length;i++){

        for(int j=0;j<nums2.length;j++){
        // 2. CHECK: Must match AND must NOT be visited yet
if(nums1[i]==nums2[j] && visited[j]==0){//if the two elements are equal and its not present in the visited array

list.add(nums2[j]);
visited[j]=1;// 3. MARK: Lock it so it's never used again
break;// 4. MOVE ON: Go to next element in nums1
}else if(nums2[j]>nums1[i]){
    break;
}
        }
        
    }
    System.out.print(list);

}
    public static void main(String[] args) {
        int []nums1={2,3,4,5,5,6,7};
        int []nums2={1,2,2,3,4,4,5,6,7,7};
        Intersection(nums1,nums2);
    }
}