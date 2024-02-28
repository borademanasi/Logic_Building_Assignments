class Room
{
       int height,width,breadth;     //instace variables
       
        Room( int h,int w,int b){      // Room is the constructor i.e Room is parameterized constructor
            
           height=h;                        // initialise the instance variables
           width=w;
           breadth=b;
          

        }
        int  volume(){
               
            int area=height*width*breadth;
            //System.out.println("The area of the Room is:"+area);
          return area;

      }

     public static void main(String args[]){
         
        Room R1=new Room(4,5,10);
          //R1.volume();
       int a= R1.volume();
      System.out.println("The area of the Room is:"+a);


    }



}
        
