import java.util.*;

class MultiplicationTable extends Thread

{
        public void run()
        {
                System.out.println("Multiplication table of 5");
                for(int i=1;i<=10;i++)
                {
                        System.out.println("5 X "+ i +"=" + (5*i));
                }
        }
}

class PrimeNumbers extends Thread
{
        int count=0;
        
        public PrimeNumbers(int count)
        {
                this.count=count;
        }
        
        public void run()
        {
                System.out.println("\nFirst "+count+"Prime Numbers:");
                int num=2;
                int printed=0;
                
                while(printed<count)
                {
                        if(isPrime(num))
                        {
                                System.out.print(num+"\n");
                                printed++;
                        }
                        num++;
                }
                System.out.println();
         }
         
         boolean isPrime(int n)
         {
                if(n<=1)
                        return false;
                for(int i=2;i<n;i++)
                {
                        if(n%i==0)
                                return false;
                }
                return true;
         }  
}

public class ThreadMain
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                MultiplicationTable mt=new MultiplicationTable();
                System.out.println("Enter limit N:");
                int n=sc.nextInt();
                PrimeNumbers pn=new PrimeNumbers(n);
                mt.start();
                pn.start();
         }
}
