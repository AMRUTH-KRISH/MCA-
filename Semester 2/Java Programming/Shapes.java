import java.util.*;
class Shapes
{
        void area(double r)
        {
                double circle=3.14*r*r;
                System.out.println("Area of cirlce: "+circle);
        }
        
        void area(int l,int b)
        {
                int rect=l*b;
                System.out.println("Area of rectangle: "+rect);
        }
        
        void area(int a)
        {
                int sq=a*a;
                System.out.println("Area of square: "+sq);
        }

        public static void main(String args[])
        {
                Shapes obj=new Shapes();
                obj.area(2.0);
                obj.area(2,3);
                obj.area(2);
        }
}
