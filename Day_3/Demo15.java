//Assume getnumber(); returns a number entered by a user. Write some code using a while loop that echos whatever number the user enters unless they enter 0 in which case the program exits. Could you do this with a for loop?
import java.util.Scanner;
class Demo15
{
         public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         while(true){
          System.out.println("Enter the number:");
          int no=sc.nextInt();
          if(no==0){
              break;    // exit from the loop
           }
          System.out.println(no);
      }
   }
}