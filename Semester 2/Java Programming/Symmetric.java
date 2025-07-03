import java.util.Scanner;
class Symmetric
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter row size:");
                int rows=sc.nextInt();
                System.out.println("Enter column size:");
                int cols=sc.nextInt();
                int[][] m1=new int[rows][cols];
                int[][] m2=new int[rows][cols];
                
                System.out.println("Enter first matrix:");
                for(int i=0;i<rows;i++)
                {
                        for(int j=0;j<cols;j++)
                        {
                                m1[i][j]=sc.nextInt();
                        }
                }
                
                for(int i=0;i<rows;i++)
                {
                        for(int j=0;j<cols;j++)
                        {
                                System.out.print(m1[i][j]+" ");
                               
                        }
                        System.out.println(" ");
                }
                
                System.out.println("Transpose:");
                for(int i=0;i<cols;i++)
                {
                        for(int j=0;j<rows;j++)
                        {
                                m2[j][i]=m1[j][i];
                        }
                }
                for(int i=0;i<cols;i++)
                {
                        for(int j=0;j<rows;j++)
                        {
                                System.out.print(m2[j][i]+" ");
                               
                        }
                        System.out.println(" ");
                }
                int f=0;
                for(int i=0;i<rows;i++)
                {
                        for(int j=0;j<cols;j++)
                        {
                                if(m1[i][j]!=m2[j][i])
                                {
                                        f=1;
                                        break;
                                }
                        }
                }
                if(f==0)
                {
                        System.out.println("Symmetric");
                }
                else
                {
                        System.out.println("Not symmetric");
                }
                
          }
}
