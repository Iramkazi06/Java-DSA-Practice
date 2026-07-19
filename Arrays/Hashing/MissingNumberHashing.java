
public class MissingNumberHashing {
    public static int findMissingNumber(int[]arr){
        int n=arr.length;
        int[]hash=new int[arr.length+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]=1;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {3, 0, 1};
        System.out.print("The original array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }

}
