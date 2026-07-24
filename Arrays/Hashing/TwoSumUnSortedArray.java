package Arrays.Hashing;
//using Hashmap
import java.util.*;
class TwoSumUnSortedArray {
public static int[] unSortedTwoSum(int[]arr,int target){
HashMap<Integer,Integer>map=new HashMap<>();
for(int i=0;i<arr.length;i++){
    int need=target-arr[i];
    if(map.containsKey(need)){
        return new int[]{map.get(need),i};
    }
map.put(arr[i],i);


}

return new int[]{-1,-1};
}
    public static void main(String[] args) {
        int []arr={9,7,5,3,1,6};
        unSortedTwoSum(arr, 8);
        int[] ans = unSortedTwoSum(arr, 8);
        System.out.print("Indices are:");
System.out.print(ans[0] + " " + ans[1]);
    }
}