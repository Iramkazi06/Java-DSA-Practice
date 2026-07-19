import java.util.*;
public class collections {
    //****************************use of TreeSet***********************************************************************************************
    //treeSet is a collection that stores unique elements in sorted order
    //that means it does not allow duplicate elements and it maintains the order of elements in ascending order
    // to print treeset we make use of for(:)loop


    //ex.1 union of two  sorted arrays
    public static void union(int []a,int[]b){
        TreeSet<Integer>set=new TreeSet<>();
        //adding elements of first array to the set
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        //adding elements of second array to the set
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        for(int x:set){
            System.out.print(x+" ");
        }
    }
    //**************************************use of arraylist************************************************************************************* */
    //now if the same union of two arrays is to be done with a different return type like arraylist then we can do it as follows
    public static ArrayList<Integer> union1(int []a,int[]b){
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:set){
            list.add(x);
        }
        return list;
    }
    //the most optimal way to find union of two arrays is to use the concept of two pointers
    public static ArrayList<Integer>union2(int []a,int []b){
        int n1=a.length;
        int n2=b.length;
        ArrayList<Integer>unionArr=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
            if(unionArr.size()==0 ||
            unionArr.get(unionArr.size()-1)!=a[i]){
                unionArr.add(a[i]);
            }
            i++;
        }else{
            if(b[j]<=a[i]){
                if(unionArr.size()==0||
            unionArr.get(unionArr.size()-1)!=b[j]){
                unionArr.add(b[j]);
            }

            j++;

            }
        }
    }
            while(i<n1){
                    if(unionArr.size()==0||
                unionArr.get(unionArr.size()-1)!=a[i]){
                    unionArr.add(a[i]);
                }
                i++;
                }
            
                        while(j<n2){
                    if(unionArr.size()==0||
                unionArr.get(unionArr.size()-1)!=b[j]){
                    unionArr.add(b[j]);
                }
                j++;
            


            }
                return unionArr;

        
        }

//****************************Brute-force approach for finding Intersection of two sorted arrays using arraylist*******************//////////////////
//time complexity of this approach is O(n*m) where n and m are the sizes of the two arrays
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
    //*********************Two-pointer approach for intersection of Array*************************** */
    //tc=O(n+m) where n and m are the sizes of the two arrays
    public static ArrayList<Integer>intersect(int[]a,int []b){
        ArrayList<Integer>intersection=new ArrayList<>();
int i=0;
int j=0;
while(i<a.length && j<b.length){
    if(a[i]<b[j]){
        i++;
    }else if(b[i]<a[i]){
        i++;
    }else{
        intersection.add(a[i]);
        i++;
        j++;
    }
    }
    return intersection;
}
    public static void main(String[] args) {
        int[]a={1,1,2,2,3,4,4,5,5};
        int [] b={1,2,3,4,4,5,6,6,7,8,8};
        System.out.print("Using TreeSet to find union of two arrays: ");
        union(a,b);
        System.out.println();
        System.out.println("  ");
                System.out.print("Using TreeSet to find union of two arrays but return type is ArrayList: ");

        System.out.println(union1(a,b));
                System.out.println("  ");

                        System.out.print("Using ArrayList to find union of two arrays but return type is ArrayList i.e using two pointer approach: ");

                System.out.println(union2(a,b));
                                System.out.println("  ");
                                System.out.print("This is the brute force approach to find intersection of two arrays using arraylist: ");
                System.out.println(intersection(a,b));
                  System.out.println("  ");
                                System.out.print("This is the two-pointer  approach to find intersection of two arrays using arraylist: ");
                System.out.println(intersect(a,b));



    }
}
    
