// Check two array is equal or not
import java.util.Scanner;
class Demo2{
      
          public static void main(String args[]){
            
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter how many elements u want to enter:");
                int no=sc.nextInt();
                int a[][]=new int[no][no];
                int b[][]=new int[no][no];

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
               boolean flag=true;
               for(int i=0;i<no;i++){
                   for(int j=0;j<no;j++){
                         if(a[i][j]!=b[i][j]){
                              flag=false;
                              break;
                        } 
                        
                      
                     }if(flag==!false){
                       break;
                   }

                    
                      
                  }
                  if(flag){
                    System.out.println("Matrices are equal");
                  }
                  else{
                     System.out.println("Matrices are not equal");
                  }
                 
                  
               }
              
              
              
     }

              