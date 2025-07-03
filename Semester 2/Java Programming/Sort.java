import java.util.*;
class Sort
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                String str;
                System.out.println("Enter a string:");
                str=sc.next();
                char[] arr=str.toCharArray();
                Arrays.sort(arr);
                String sorted=new String(arr);
                System.out.println("Sorted string: "+sorted);
        }
}
