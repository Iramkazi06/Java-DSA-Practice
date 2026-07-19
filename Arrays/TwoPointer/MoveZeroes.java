public class MoveZeroes {
   public static void zeros(int[] arr) {

    int zero = 0;
    int nonzero = 0;

    while (nonzero < arr.length) {

        if (arr[nonzero] != 0) {//we are moving non zero elements to the front thus when a element is not equal to zero then we swap it and move zeros to the end

            int temp = arr[nonzero];
            arr[nonzero] = arr[zero];
            arr[zero] = temp;

            zero++;
            nonzero++;
        } else {
            nonzero++;
        }
    }
}
    public static void main(String[]args){
    int[]arr={1,1,2,0,3,5,0,9,0,7,0,8};
        System.out.print("The original array is:");
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
System.out.println(" ");
    System.out.print("The nonzero array is:");
    zeros(arr);
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
}
