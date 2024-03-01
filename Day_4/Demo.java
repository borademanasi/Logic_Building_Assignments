// find the average of elements in an array
import java.util.Scanner;
class  Demo{

         public static void main(String args[]){
     
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter how many elements u want to enter in the array");
              int no=sc.nextInt();
             // int sum=0;
              float avg,sum=0.0f;
              int arr[]=new int[no];
              System.out.println("Enter the array elements:");
              for(int i=0;i<no;i++){
               arr[i]=sc.nextInt();
              }
              System.out.println("Entered elements:");
               for(int i=0;i<no;i++){
               System.out.println(arr[i]);
               sum+=arr[i];
               }
               System.out.println("Sum of elements in array:"+sum);
               System.out.println("Avg of elements in array:" +(sum/no));
    } 
}
     
     