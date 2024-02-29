// Demo15 program is doing using for loop
import java.util.Scanner;
class Demo16
{
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=1;
         for(; ;){  // condition is not writing here then  the condition is bydefault true

            System.out.println("Enter the number:");
            int no=sc.nextInt();
            if(no==0){
             break; 
            }
           System.out.println(no);
           } i++;
    }
}