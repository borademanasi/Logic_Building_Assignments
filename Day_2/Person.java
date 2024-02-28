class Person
{
   // in this code is using Constructor Overloadng 



     int age;
     double height,weight;
     Person(int a,double h,double w){    //  constructor with all three arguments
     age=a;
     height=h;
    weight=w;
     }

     Person(int a,double h){     // constructor with two arguments
     age=a;
     height=h;
     }  

      Person(int a){     // constructor with  one arguments
     age=a;
     
     }  
     
    Person(){

     }
    
     void display(){
       System.out.println("The age is:" +age);
       System.out.println("The height is:" +height);
       System.out.println("The weight is:" +weight);
     

     }
     public static void main(String args[]){
        Person d1=new Person(45,5.4,54.6); 
        d1.display();

        Person d2=new Person(68,6.1);
        d2.display();

        Person d3=new Person(88);
        d3.display();

       Person d4=new Person();
       d4.display();

          
     }

}