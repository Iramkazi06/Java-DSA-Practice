package Arrays;
//time complexity of this approach is O(n*m) where n and m are the sizes of the two arrays

import java.util.ArrayList;

public class BruteForceOfIntersectionOfTwoArrays {
     public static ArrayList<Integer>intersection(int []a,int []b){
       
        int[]vis=new int[b.length];//to keep track of the visited elements in the second array
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]&&vis[j]==0){//if the element is present in both arrays and it is not visited then add it to the arraylist
                    al.add(a[i]);//adding the element to the arraylist
                    vis[j]=1;//marking the element as visited so that it is not added again in the arraylist
                }
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[]a={1,1,2,3,4,4,5};
        int[]b={1,2,3,4,4,5,5,6,7,7,8,9};
        System.out.print("The Intersection of two arrays are:" +" "+intersection(a,b));
    }
    
}
