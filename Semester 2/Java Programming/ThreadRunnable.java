import java.util.*;

class MultiplicationTable implements Runnable

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

class PrimeNumbers implements Runnable
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

public class ThreadRunnable
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter limit N:");
                int n=sc.nextInt();
                Runnable task1=new MultiplicationTable();
                Runnable task2=new PrimeNumbers(n);
               
                Thread mt=new Thread(task1);
                Thread pn=new Thread(task2);
                mt.start();
                pn.start();
         }
}
