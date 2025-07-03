import java.util.*;
class Employee
{
        Scanner sc= new Scanner(System.in);
        int eNo;
        String eName;
        int Salary;
        
        void read()
        {
                System.out.println("Enter eNo:");
                eNo=sc.nextInt();
                System.out.println("Enter eName:");
                eName=sc.next();
                System.out.println("Enter salary:");
                Salary=sc.nextInt();
         }
        
        public static void main(String args[])
        {
                Scanner scan=new Scanner(System.in);
                int search,flag=0;
                Employee obj[]=new Employee[3];
                for(int i=0;i<3;i++)
                {
                        obj[i]=new Employee();
                }
                System.out.println("Enter employee details:");
                for(int i=0;i<3;i++)
                {
                        obj[i].read();
                }
                System.out.println("Enter eNo to search:");
                search=scan.nextInt();
                for(int i=0;i<3;i++)
                {
                        if(obj[i].eNo==search)
                        {
                                System.out.println("Name: "+obj[i].eName+"\n Salary: "+obj[i].Salary);
                                flag=1;
                        }
                 }
                 if(flag==0)
                 {
                        System.out.println("Not found");
                 }
        }
}
