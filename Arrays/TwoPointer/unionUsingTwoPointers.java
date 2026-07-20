package Arrays.TwoPointer;
//Since the input arrays are sorted, duplicate values appear next to each other. By comparing the current element with the last element already added to the union, we ensure each value is added only once, avoiding duplicates without using extra space like a Set

import java.util.ArrayList;
public class unionUsingTwoPointers {

    

public static ArrayList<Integer> union(int[] a1, int[] a2){

    ArrayList<Integer> list = new ArrayList<>();

    int i = 0;
    int j = 0;

    while(i < a1.length && j < a2.length){

        if(a1[i] < a2[j]){
//to make sure that the eelemnt is not duplicate
            if(list.size()==0 || list.get(list.size()-1)!=a1[i]){
                list.add(a1[i]);
            }
            //move the pointer
            i++;

        }
        else if(a1[i] > a2[j]){

            // add a2[j] if not duplicate
            
             if(list.size()==0 || list.get(list.size()-1)!=a2[j]){
                list.add(a2[j]);
            }
            //move j pointer
            j++;

        }
        else{

  if(list.size()==0 || list.get(list.size()-1)!=a2[j]){
                list.add(a2[j]);
            }
            i++;
            j++;
            

        }

    }

    while(i < a1.length){

    if(list.size()==0 || list.get(list.size()-1)!=a1[i]){
        list.add(a1[i]);
    }
    i++;


    }

    while(j < a2.length){

    if(list.size()==0 || list.get(list.size()-1)!=a2[j]){
        list.add(a2[j]);
    }
    j++;

    }

    return list;
}
public static void main(String[] args) {
    int []a1={1,2,3,3,4};
    System.out.print("First Array a1:");
        for(int i=0;i<a1.length;i++){
        System.out.print(a1[i]+" ");

        }
System.out.println(" ");
    int []a2={1,2,3,4,4,5,6,7,7};
        System.out.print("First Array a2:");

    for (int i=0;i<a2.length;i++){
                System.out.print(a2[i]+" ");

    }
System.out.println(" ");

            System.out.print("union of a1 Array and  a2 array:"+" "+union(a1,a2));

}
}