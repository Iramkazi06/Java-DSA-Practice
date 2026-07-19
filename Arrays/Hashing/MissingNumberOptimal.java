
public class MissingNumberOptimal {
    public static int optimal(int[]arr){
    int n=arr.length;
            int sum=0;
        int actualSum=n*(n+1)/2;

    for(int i=0;i<n;i++){//to add the numbers in a array
        sum=sum+arr[i];
    }
    return sum-actualSum;
    }
    public static void main(String []args){
        int []arr={1,2,4,5,6};
        System.out.print("The original array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.print("The missing number is:"+optimal(arr));
        
    }
}
