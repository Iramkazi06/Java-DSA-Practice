package Arrays.TwoPointer;
//twosum for sorted array
public class twoSum {
    public static int[] twosum(int[]nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<right){
                    int sum=nums[left]+nums[right];

        if(sum==target){
            return new int[]{left,right};
        } else if(sum>target){//ie 2+15>9 so what we need to do in order to decrease the total sum
            right--;

        }else{
            left++;
        }
    }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        System.out.print("The actual array:");
        int []nums={1,2,3,4,5};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println(" ");
int[] ans = twosum(nums, 9);
System.out.println("Indices are: " + ans[0] + " " + ans[1]);        
    }

    
}
