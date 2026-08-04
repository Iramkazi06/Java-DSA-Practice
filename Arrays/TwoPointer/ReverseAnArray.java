package Arrays.TwoPointer;
public class ReverseAnArray{
    public static void rev(int[]a){
        int n=a.length;
        int i=0;
        int j=n-1;
        while(i<j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
    }
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8};
        int n=a.length;
        rev(a);
        for (int i=0;i<n;i++){
System.out.print(a[i]+" ");
        }
    }
}