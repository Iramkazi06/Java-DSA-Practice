package Arrays;
import java.util.*;
public class ThreeSumBruteForce {
    public static List<List<Integer>>triplet(int[]arr){
Set<List<Integer>>set=new HashSet<>();
int n=arr.length;
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        for (int k = j+1; k < n; k++) {
            if(arr[i]+arr[j]+arr[k]==0){
                List<Integer>ls=new ArrayList<>() ;
                    ls.add(arr[i]);
                     ls.add(arr[j]);
                    ls.add(arr[k]);
Collections.sort(ls);

                        set.add(ls);
                
            }
        }
    }
}
return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        System.out.println(triplet(arr));
    }
}
