//all searching algorithms

//linear search
//we have the key and we have to find the index of the key in the array if it is present otherwise return -1
public class search{
    public static void linearSearch(int[]a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("Element found at index: " + i);
                return ;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
       int[] a={10,20,30,40,50,60};
linearSearch(a,30);
    }
}