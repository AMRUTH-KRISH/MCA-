import java.util.Scanner;


abstract class Shape 
{
 
    abstract void findArea();
}


class Rectangle extends Shape 
{
    double length, width;

   
    Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

   
   
    void findArea() 
    {
        double area= length * width;
        System.out.println("Area of rectangle: "+area);
    }
}

class Circle extends Shape
{
        double radius;
        
        Circle(double radius)
        {
                this.radius=radius;
        }
        
        void findArea()
        {
                double area=Math.PI*radius*radius;
                System.out.println("Area of circle: "+area);
        }
}

class Square extends Shape
{
        double side;
        
        Square(double side)
        {
                this.side=side;
        }
        
        void findArea()
        {
                double area=side*side;
                System.out.println("Area of square: "+area);
        }
}

public class ShapeTest
{
         public static void main(String args[])
         {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter length of rectangle:");
                double length=sc.nextDouble();
                System.out.println("Enter width of rectangle:");
                double width=sc.nextDouble();
                Shape rectangle=new Rectangle(length,width);
                
                System.out.println("Enter radius of circle:");
                double radius=sc.nextDouble();
                Shape circle=new Circle(radius);
                
                System.out.println("Enter side of square:");
                double side=sc.nextDouble();
                Shape square=new Square(side);
                
                rectangle.findArea();
                circle.findArea();
                square.findArea();
         }
}
