public class elementAppearingOnce {
public static int appearOnce(int[]arr){
    //we will
    for(int i=0;i<arr.length;i++){
        int element=arr[i];
        int cnt=0;
       for(int j=0;i<arr.length;j++){
        if(arr[j]==element){
            cnt++;
        }
       }
       if(cnt==1){
        return element;
       }
    }
return -1;
}
public static void main(String[] args) {
    System.out.print("Original array:");
    int []arr={1,1,3,3,4,5,6,7,8,8};
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println(" ");
    System.out.print(appearOnce(arr));

}
    
}