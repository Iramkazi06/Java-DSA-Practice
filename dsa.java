public class dsa{
    //remove duplicates from sorted array
    public static int removeDuplicates(int []a){
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }

        return i+1;
    }
    //move zeros at the end of the array
    public static void moveZeros(int []arr,int nonzero,int zero){
        while(nonzero<arr.length){
if(arr[nonzero]!=0){
int temp=arr[nonzero];
arr[nonzero]=arr[zero];
arr[zero]=temp;
nonzero++;
zero++;
}else{
    nonzero++;
}
}
    }
    //************************8finding the  missing element using hashed array********************* */
    //time complexity of this approach is O(n) where n is the size of the array
    //in this approach we create a hash array of size n+1 and initialize all the elements to 0
    //then we traverse the given array and mark the elements present in the array in the hash array
    
    public static int missingElemnt(int []a1,int n){

        int []hash=new int[n+1];
        for(int i=0;i<a1.length;i++){
            hash[a1[i]]=1;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }
return 0;
    }
    //to add all numbers in a array from 1 to n and then subtract the sum of the array from the sum of the numbers from 1 to n
    public static int sumElements(int[]arr,int n){
        int asum=0;
        for(int i=0;i<arr.length;i++){
            asum=asum+arr[i];
        }
        return asum;
    }
    //optimal approach to find the missing element in the array using sum of n numbers*****************//
    //in this approach we find the sum of n numbers using the formula n*(n+1)/2 and then subtract the sum of the array from the sum of n numbers
    public static int missingElementOptimal(int []a1,int n){
        int asum=0;
        for(int i=0;i<a1.length;i++){
            asum=asum+a1[i];
        }
        int total=n*(n+1)/2;
        return total-asum;
    }
//finding more than 1 missing element in a array using hashing technique
public static void findK(int[] arr, int k) {

    int n = arr.length + k;

    int[] hash = new int[n + 1];

    // Mark all present numbers
    for (int i = 0; i < arr.length; i++) {
        hash[arr[i]] = 1;
    }

    // Print missing numbers
    for (int i = 1; i <= n; i++) {
        if (hash[i] == 0) {
            System.out.print(i + " ");
        }
    }
}


    public static void main(String[] args) {
        int []a={1,1,2,2,3,4,4,5};
       int k= removeDuplicates(a);
              System.out.print(" Array after removing duplicates: ");

       for(int i=0;i<k;i++){
        System.out.print(a[i]+" ");
       }

       System.out.println(" ");

       int []arr={0,1,0,3,12};
 moveZeros(arr,0,0);
        System.out.print(" MOving zeros at the end of the array: ");

for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }

       System.out.println(" ");
       int []a1={1,2,3,4,6,7,8,9,10};   
       System.out.print("Finding the missing element in the array: ");
       System.out.println(missingElemnt(a1,10));
        System.out.println(" ");
System.out.print("Finding the sum of the elements in the array: ");
System.out.println(sumElements(arr,10));
System.out.println(" ");
System.out.print("Finding the missing element using the optimal approach: ");
System.out.println(missingElementOptimal(a1,10));
System.out.println(" ");
System.out.print("Finding more than one missing element: ");
findK(a1, 2);

}
}