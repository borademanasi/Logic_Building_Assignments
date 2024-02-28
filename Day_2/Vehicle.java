class  Vehicle
{
        float price;
         String color,model;

         Vehicle(float p,String c, String m){
          price=p;
         color=c;
         model=m;
        }

        void  display(){
             System.out.println("The Price of the car is:"  +price);
             System.out.println("The Color  of the car is:"  +color);
             System.out.println("The Model of the car is :"  +model);
        }
       

      
       public static void main(String args[]){
       Vehicle p1=new Vehicle(65000.50f,"Black","Toyoto23E");
        p1.display();
       
       }
}