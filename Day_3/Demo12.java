// find the sum of the digit of the given number

import java.util.Scanner;

class Demo12{
      
      public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      int no=sc.nextInt();
      int sum=0,rem;
      do{
              rem=no%10;
              sum=sum+rem;
              no=no/10;
            
          }while(no!=0);
         System.out.println("The sum of the digit of the given number is:" +sum);
   }

}
