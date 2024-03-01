// Addition od two  numbers
import java.util.Scanner;
class Demo1{
      
          public static void main(String args[]){
            
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter how many elements u want to enter:");
                int no=sc.nextInt();
                int a[][]=new int[no][no];
                int b[][]=new int[no][no];
                int c[][]=new int[no][no];

               // matrix 1
                for(int i=0;i<no;i++){ // rows
                   for(int j=0;j<no;j++){ // cols
                    a[i][j]=sc.nextInt();
                   }
               }
               System.out.println("Matrix 1:");
               for(int i=0;i<no;i++){
                   for(int j=0;j<no;j++){
                    System.out.print(a[i][j]+" ");
                   }
                  System.out.println("\n");
                  
               }

            // matrix 2
              
             for(int i=0;i<no;i++){
                   for(int j=0;j<no;j++){
                    b[i][j]=sc.nextInt();
                   }
               }
               System.out.println("Matrix  2:");
               for(int i=0;i<no;i++){
                   for(int j=0;j<no;j++){
                    System.out.print(b[i][j]+" ");
                   }
                  System.out.println("\n");
                  
               }
               System.out.println("Addition of the matrix is:");

               for(int i=0;i<no;i++){
                   for(int j=0;j<no;j++){
                     c[i][j]=a[i][j]+b[i][j];
                     System.out.print(c[i][j]+" ");
                   }
                  System.out.println("\n");
               }
              
     }
}
              