package Arrays;

public class LargestElement{
public static int maxelement(int[]arr){
    int max=arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
return max;

}
    public static void main(String[]args){
int[]arr={8,3,5,6,8,9,0,3,1};
System.out.print("The Largest Elemnt In the Array is:"+ maxelement(arr));

}}