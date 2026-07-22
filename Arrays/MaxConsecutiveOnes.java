//If the element is 1:
//Increase count.
//Otherwise:
//Update maxCount if the current streak is larger.
//Reset count to 0.
//After the loop:
//Compare one last time because the array might end with 1s.
package Arrays;
public class MaxConsecutiveOnes {
    public static int maximum(int []arr){
int count1=0;
int maxCount=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]==1){
        count1++;
    }else{
        //ex.maxCount = Math.max(2, 4);
        //thus maxCount=4
        maxCount = Math.max(maxCount, count1);
        count1=0;
    }
}
return maxCount;
    }
    public static void main(String[]args){
int[]arr={1,2,3,4,1,1,1,1,3,4,5,6,7,1};
System.out.print(" Number of Maximum 1's in the array are:"+" "+maximum(arr));
    }
}
