//find the factorial of the given number

import java.util.Scanner;
class Demo11{
   
              public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the number:");
              int no=sc.nextInt();
              int fact=1,i=1;
              while(i<=no)
              {
                     fact=fact*i;
                     i++;
              }
             System.out.println("The factorial of the "+ no +  "is :" +fact);

    }
}
               