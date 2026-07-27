package  Arrays;
public class LargestElement{

    public static int Largest(int[]arr){
int largest=arr[0];
for(int i=1;i<arr.length;i++){
    if(largest<arr[i]){
        largest=arr[i];
    }
}
return largest;
    }
    public static void main(String[] args) {
        int[]arr={5,6,3,9,1,7,11};
        System.out.println(Largest(arr));
    }
}