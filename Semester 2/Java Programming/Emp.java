import java.util.*;

class Employee
{
        int Empid;
        String Name;
        double Salary;
        String Address;
        
        Employee(int Empid,String Name,double Salary,String Address)
        {
                this.Empid=Empid;
                this.Name=Name;
                this.Salary=Salary;
                this.Address=Address;
        }
}

class Teacher extends Employee
{
        String Department;
        String SubjectsTaught;
        
        Teacher(int Empid,String Name,double Salary,String Address,String Department,String SubjectsTaught)
        {
                super(Empid,Name,Salary,Address);
                this.Department=Department;
                this.SubjectsTaught=SubjectsTaught;
        }
        
        void display()
        {
                System.out.println("Employee ID: "+Empid);
                System.out.println("Name: "+Name);
                System.out.println("Salary: "+Salary);
                System.out.println("Address: "+Address);
                System.out.println("Department: "+Department);
                System.out.println("SubjectsTaught: "+SubjectsTaught);
                System.out.println(" ");
        }
}

class Emp
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter number of teachers:");
                int n=sc.nextInt();
                sc.nextLine();
                
                Teacher[] teachers=new Teacher[n];
                
                for(int i=0;i<n;i++)
                {
                        System.out.println("\nEnter details of teacher: "+(i+1));
                        System.out.print("Employee ID: ");
                        int empid=sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name=sc.nextLine();
                        System.out.print("Salary: ");
                        double salary=sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Address: ");
                        String address=sc.nextLine();
                        System.out.print("Department: ");
                        String department=sc.nextLine();
                        System.out.print("subjects taught: ");
                        String subjectsTaught=sc.nextLine();
                        
                        teachers[i]=new Teacher(empid,name,salary,address,department,subjectsTaught);
                }
                
                System.out.println("Details of Teachers: \n");
                
                for(int i=0;i<n;i++)
                {
                        teachers[i].display();
                }
       }
}
