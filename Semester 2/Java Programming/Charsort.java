import java.util.*;
class Charsort
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter number of strings: ");
                int n=sc.nextInt();
                String[] str=new String[n];
                
                System.out.println("Enter the strings:");
                for(int i=0;i<n;i++)
                {
                        str[i]=sc.next();
                }
                
                Arrays.sort(str);
                System.out.println("Sorted strings: ");
                for(int i=0;i<n;i++)
                {
                        System.out.println(str[i]);
                }
       }
}
