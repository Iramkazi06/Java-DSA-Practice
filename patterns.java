public class patterns{
    public static void printPattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void printPattern2(int n){
        for(int i=0;i<n;i++){
           for(int j=0;j<=i;j++){
            System.out.print("*");
           }
              System.out.println(" ");
        }
    }
    public static void  printPattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);//its j+1 because we want to print the numbers starting from 1 to n
            }
            System.out.println(" ");
    }
}
//*****
// ****
// ***
// **
// *
//  */
public static void printPattern4(){
    for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
    public static void main(String[]args){
        printPattern1(5);
        System.out.println(" ");
        printPattern2(5);
         System.out.println(" ");
        printPattern3(5);
          System.out.println(" ");
        printPattern4();
    }
}