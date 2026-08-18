// Brute force approach 
//this code handles the duplicates
 
package Arrays.TwoPointer;
import java.util.*;
class ThreeSum {
public static void main(String[] args) {
int[] a = {-1, 0, 2, 0, -1, -1, 3, 2, 0, 1};
int n=a.length;
Arrays.sort(a);
ArrayList<ArrayList<Integer>>res=new ArrayList<>();
for(int i=0;i<n-2;i++){
if(i>0 && a[i]==a[i-1]){
continue;
}
for(int j=i+1;j<n-1;j++){
if(j>i+1 && a[j]==a[j-1]){
continue;
}
for(int k=j+1;k<n;k++){
if(k>j+1 && a[k]==a[k-1]){
continue;}
int sum=a[i]+a[j]+a[k];
if(sum==0){
//store

        ArrayList<Integer>list=new ArrayList<>();
        list.add(a[i]);
        list.add(a[j]);
        list.add(a[k]);

res.add(list);

    }
}

    }

}
System.out.println(res);


}
}  
