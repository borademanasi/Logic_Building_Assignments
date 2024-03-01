// Find out the maximum and minimum number from the array
import java.util.Scanner;
class Demo3{
              public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter how many numbers u want to enter in the array");
              int no=sc.nextInt();
              int arr[]=new int[no];
              for(int i=0;i<arr.length;i++){
                 arr[i]=sc.nextInt();
              }
              System.out.println("You Entered Elements are");
              for(int i=0;i<arr.length;i++){
                System.out.println(arr[i] + " " );
             }


            // logic to find the maximum number from  the array
             int max=arr[0];
             for(int i=0;i<arr.length;i++){
              
              if(arr[i]>max){
                 max=arr[i];
                  
            
                }


            }  
           System.out.println("The maximum number is:" +max);



          // logic to find the minimum number from the array
          int min=arr[0];
             for(int i=0;i<arr.length;i++){
              
              if(arr[i]<min){
                 min=arr[i];
                  
            
                }


            }  
           System.out.println("The minimum number is:" +min);

          
     
             


             
     }
              
}
