class Library{
          String b_name,b_author;
          float b_price;
           
          Library(String b_n,String b_a,float b_p){
             b_name=b_n;
             b_author=b_a;
             b_price=b_p;
             }
            void displayDetails(){
               System.out.println("The book name is "+b_name+ " Author is "+b_author+ "Price is "  +b_price);
            }


            public static void main(String args[]){
             Library l1=new Library("Wings of fire","A.P.J Kalam",125.0f);
             l1.displayDetails();

          }
}