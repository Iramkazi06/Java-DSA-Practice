public class RemoveDuplicates {

    public static int removeDuplicates(int[] a) {
        int i = 0;

        for (int j = 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] a = {1,1,2,2,3,4,4,5};
        System.out.print("Before Removing Duplicates: ");
for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
}
System.out.println(" ");        

            System.out.print("After Removing Duplicates: ");
            int k=removeDuplicates(a);//call of the function is stored in k coz the function returns the length of the array after removing duplicates
            for(int i=0;i<k;i++){//k is the length of the array after removing duplicates so we will print the array till k
            System.out.print(a[i] + " ");
}
        
    }
}