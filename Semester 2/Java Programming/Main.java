class CPU
{
        int price=50000;
        
        class Processor
        {
                int core=8;
                String manufacturer="INTEL";
                
                void displayprocessor()
                {
                        System.out.println("Processor Information:");
                        System.out.println("Number of cores:"+core);
                        System.out.println("Manufacturer:"+manufacturer);
                }
        }
        
        static class RAM
        {
                int memory=64;
                String manufacturer="ABC";
                
                void displayram()
                {
                        System.out.println("RAM Information:");
                        System.out.println("Memory:"+memory);
                        System.out.println("Manufacturer:"+manufacturer);
                }
        }
}

public class Main
{
        public static void main(String args[])
        {
                CPU cpu=new CPU();
                CPU.Processor pro=cpu.new Processor();
                pro.displayprocessor();
                CPU.RAM ram=new CPU.RAM();
                ram.displayram();
        }
}
