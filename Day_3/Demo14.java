//Write a Java program for a simple calculator that performs addition, subtraction, multiplication, and division.

import java.util.Scanner;
class Demo14
{
         public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first number:");
         int num1=sc.nextInt();
         System.out.println("Enter the second number:");
         int num2=sc.nextInt();
         System.out.println("Enter ur choice 1.Addition 2.Subtraction 3.Multiplication 4.Devision");
         int ch=sc.nextInt();
         switch(ch)
         {
              case 1: System.out.println("The Addition of the given numbers are :"+(num1+num2));
                         break;

              case 2: System.out.println("The Subtraction of the given numbers are :" +(num1-num2));
                         break;

              case 3: System.out.println("The Multiplication of the given numbers are :" +(num1*num2));
                         break;
                
              case 4: System.out.println("The Division of the given numbers are :" +(num1/num2));
                         break;
  
               default: System.out.println("Invalid Choice");
                          break;
            
         }
   }
}
         
       
