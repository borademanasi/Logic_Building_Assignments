class Student
{
           String s_name;
           int sub1,sub2, sub3;

            void initialise(){
              s_name="Manasi";
              sub1=45;
              sub2=44;
              sub3=25;

            }

            void totalAverage(){
               int avg=(sub1+sub2+sub3)/3;
               System.out.println("The total average mark is:"+avg);

           }

           void displayNameAndMarks(){
            System.out.println("The name of the student is " + s_name);
            System.out.println("The total mark of the student is:" +(sub1+sub2+sub3));


         }



                 public static void main(String args[]){
               
                  Student s1=new Student();
                  s1.initialise();
                  s1.totalAverage();
                  s1.displayNameAndMarks();
                  

                  
                
              }

}
