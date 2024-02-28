class Box
{ 
           int height,width,breadth;
           Box(int h,int w,int b){
                height=h;
                width=w;
                breadth=b;

         }
         int getVolume(){
            int volume=height*width*breadth;
            return volume;


         }
         int  getArea(){
           int surfacearea=2*(height*width+width*breadth+breadth*height);
           return surfacearea;
           
         }
         public static void main(String args[])
        {
           Box b1=new Box(4,5,6);
           int volume=b1.getVolume();
            System.out.println("The volume of the box is: "  +volume);

            int surfacearea=b1.getArea();
            System.out.println("The surface area of the box is:"  +surfacearea);

            Box b2=new Box(9,4,2); 
            System.out.println("The volume of the box is: "  + b2.getVolume());
            System.out.println("The surface area of the box is:"  + b2.getArea());

       

         
           


        }    

}
