// this is the better approach and the time complexity is O(2n)
//In this we consider counter for 0/1/2 everytime we encounter 0/1/2 we update the counter of the respective element by 1
//this way it stores 0s 1s and 2s 
//and after storing we  add those elemnts to the array in a sorted manner 
class SortZerosOnesTwos {
    public static void sort(int[]nums){
        int count0=0;
        int count1=0;
        int count2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count0++;
            }else if(nums[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            //add 0 to that indexs
            nums[i]=0;

        }
         for(int i=count0;i<count0+count1;i++){
            //add 1 to that indexs
            nums[i]=1;

        } for(int i=count0+count1;i<n;i++){
            //add 2 to that indexs
            nums[i]=2;

        }


    }
public static void main(String[] args) {
System.out.print("Before Sorting:");
    int []nums={0,1,2,0,1,2,0,1,2,1,0,2,2,1};
    for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
    }
        System.out.println(" ");

    sort(nums);
System.out.print("After Sorting:");

     for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
    }

    
}
    
}