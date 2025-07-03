public class Exception
{
        public static void main(String[] args)
        {
                try
                {
                        int a=10;
                        int b=0;
                        int result=a/b;
                        System.out.println("Result: "+result);
                }
                
                catch(ArithmeticException e)
                {
                        System.out.println("Caught ArithmeticException: "+e.getMessage());
                
                }
                
                try
                {
                        int[] numbers={1,2,3};
                        System.out.println("Accessing elements at index 5: "+numbers[5]);
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                        System.out.println("Caught ArrayIndexOutOfBoundsException: "+e.getMessage());
                }
                
                System.out.println("Program continues after exception handling.");
    
