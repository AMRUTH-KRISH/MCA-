import java.util.Scanner;
class Complex
{
        public static void main(String args[])
        {
                Scanner in=new Scanner(System.in);
                System.out.println("Enter real part of num1:");
                int r1=in.nextInt();
                System.out.println("Enter img part of num1:");
                int img1=in.nextInt();
                System.out.println("Enter real part of num2:");
                int r2=in.nextInt();
                System.out.println("Enter img part of num2:");
                int img2=in.nextInt();
                int real=r1+r2;
                int img=img1+img2;
                System.out.println("Sum is :"+real+"+"+img+"i");
         }
}
