import java.util.*;

interface Shape
{
        void area();
        void perimeter();
}

class Circle implements Shape
{
        double radius;
        
        Circle(double radius)
        {
                this.radius=radius;
        }
        
        public void area()
        {
                double area=Math.PI*radius*radius;
                System.out.println("Area of circle: "+area);
        }
        
        public void perimeter()
        {
                double perimeter=2*Math.PI*radius;
                System.out.println("Perimeter of circle: "+perimeter);
        }
}

class Rectangle implements Shape
{

        double length,width;
        
        Rectangle(double length,double width)
        {
                this.length=length;
                this.width=width;
        }
        
        public void area()
        {
                double area=length*width;
                System.out.println("Area of rectangle: "+area);
        }
        
        public void perimeter()
        {
                double perimeter=2*(length+width);
                System.out.println("Perimeter of rectangle: "+perimeter);
        }
}

public class ShapeTestInterface
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                int choice;
                do
                {
                        System.out.println("\nMenu:");
                        System.out.println("1.Circle - calculate area and perimeter");
                        System.out.println("2.Rectangle - calculate area and perimeter");
                        System.out.println("3.Exit");
                        System.out.print("Enter your choice:");
                        choice=sc.nextInt();
                        
                        switch(choice)
                        {
                                case 1:System.out.print("Enter radius of circle: ");
                                        double radius=sc.nextDouble();
                                        Circle circle=new Circle(radius);
                                        circle.area();
                                        circle.perimeter();
                                        break;
                                        
                                case 2:System.out.print("Enter length of rectangle:");
                                        double length=sc.nextDouble();
                                        System.out.print("Enter width of rectangle:");
                                        double width=sc.nextDouble();
                                        Rectangle rectangle=new Rectangle(length,width);
                                        rectangle.area();
                                        rectangle.perimeter();
                                        break;
                                
                                case 3:System.out.println("Exiting...");
                                        break;
                                        
                                default:System.out.println("Invalid choice");
                        }
                }while(choice!=3);
        }
}
