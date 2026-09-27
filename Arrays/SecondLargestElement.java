//WITH DUPLICATES
package Arrays;
public class SecondLargestElement{
    public static int secondMax(int []nums){
int max=nums[0];
int smax=nums[1];

for(int i=0;i<nums.length;i++){
    if(nums[i]>max){
                max=smax;

        max=nums[i];
    }else if(nums[i]>smax){
    smax=nums[i];
        
    }

}
return smax;
    }
    public static void main(String[]args){
int[]nums={9,4,6,4,3,8,0,2,5,5,4,3,90,45};
System.out.println(secondMax(nums));
    }
}
