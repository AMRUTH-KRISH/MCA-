import java.util.Scanner;
class Product
{
        int pcode,price;
        String pname;
        public static void main(String args[])
        {
                
                Scanner in=new Scanner(System.in);
                System.out.println("Enter name of product1:");
                String pn1=in.next();
                System.out.println("Enter code of product1:");
                int co1=in.nextInt();
                System.out.println("Enter price of product1:");
                int pri1=in.nextInt();
               
                System.out.println("Enter name of product2:");
                String pn2=in.next();
                System.out.println("Enter code of product2:");
                int co2=in.nextInt();
                System.out.println("Enter price of product2:");
                int pri2=in.nextInt();
                
                System.out.println("Enter name of product3:");
                String pn3=in.next();
                System.out.println("Enter code of product3:");
                int co3=in.nextInt();
                System.out.println("Enter price of product3:");
                int pri3=in.nextInt();
                
                Product p1=new Product();
                p1.read(co1,pn1,pri1);
                Product p2=new Product();
                p2.read(co2,pn2,pri2);
                Product p3=new Product();
                p3.read(co3,pn3,pri3);
                Product p=new Product();
                p.compare(p1,p2,p3);
        }
        
        void read(int code,String name,int pri)
        {
                pcode=code;
                pname=name;
                price=pri;
        }
        
        void compare(Product p1,Product p2,Product p3)
        {
                if(p1.price<p2.price && p1.price<p3.price)
                {
                        System.out.println("Product1 has lowest price");
                }
                else if(p2.price<p1.price && p2.price<p3.price)
                {
                        System.out.println("Product2 has lowest price");
                }
                else
                {
                        System.out.println("Product3 has lowest price");
                }
        }
}
