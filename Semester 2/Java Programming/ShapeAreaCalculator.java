import java.util.Scanner;


abstract class Shape {
 
    abstract void findArea();
}


class Rectangle extends Shape {
    double length, width;

   
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
   
    void findArea() {
        double area= length * width;
        System.out.println("Area of rectangle: "+area);
    }
}


class Circle extends Shape {
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

   
    double findArea() {
        return Math.PI * radius * radius;
    }
}


class Square extends Shape {
    private double side;

    
    public Square(double side) {
        this.side = side;
    }

   
    double findArea() {
        return side * side;
    }
}


public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);

        
        System.out.println("\nAreas of Shapes:");
        System.out.println("Rectangle Area: " + rectangle.findArea());
        System.out.println("Circle Area: " + circle.findArea());
        System.out.println("Square Area: " + square.findArea());

        scanner.close();
    }
}
