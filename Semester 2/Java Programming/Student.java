import java.util.Scanner;
class Student
{
        public static void main(String args[])
        {
        
                int[] marks=new int[5];
                System.out.println("Enter 5 marks:");
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<5;i++)
                {
                        marks[i]=sc.nextInt();
                }
                int total=0;
                for(int i=0;i<5;i++)
                {
                        total=total+marks[i];
                }
                int per=(total/50)*100;
                System.out.println("Total mark:"+total);
                System.out.println("Percentage:"+per);
        }
}
