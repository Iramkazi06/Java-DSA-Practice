package Arrays.TwoPointer;
import java.util.*;
public class IntersectionOfArray {
    public static ArrayList<Integer> IntersectionOfArraysTwoPointer(int[]nums1,int[]nums2){
        ArrayList<Integer>list=new ArrayList<>();
int i=0;
int j=0;
while(i<nums1.length && j<nums2.length){
if(nums1[i]<nums2[j]){
    i++;
}else if(nums1[i]>nums2[j]){
    j++;
}else{
    list.add(nums1[i]);
    i++;
    j++;
}
}
return list;
    }

    public static void main(String[] args) {
        int[]nums1={1,2,2,3,3,4,5,6};

        int[]nums2={2,3,3,5,6,7};
        System.out.print(IntersectionOfArraysTwoPointer(nums1,nums2));
    }
    
}
