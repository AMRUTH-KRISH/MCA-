import java.util.*;
class Search
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                int[] A=new int[5];
                int key,flag=0,pos=0;
                System.out.println("Enter the elements:");
                for(int i=0;i<5;i++)
                {
                        A[i]=sc.nextInt();
                }
                System.out.println("Enter element to search:");
                key=sc.nextInt();
                for(int i=0;i<5;i++)
                {
                        if(A[i]==key)
                        {
                                flag=1;
                                pos=i+1;
                                break;
                        }
                }
                if(flag==1)
                {
                        System.out.println("Element found at "+pos);
                }
                else
                {
                        System.out.println("Element not found");
                }
         }
}
