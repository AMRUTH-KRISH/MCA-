import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener
{
        TextField tf1,tf2,tfResult;
        Button btnAdd,btnSub,btnMul,btnDiv,btnClear;
        
        public SimpleCalculator()
        {
                setLayout(new FlowLayout());
                
                add(new Label("Number 1:"));
                tf1=new TextField(5);
                add(tf1);
                
                add(new Label("Number 2:"));
                tf2=new TextField(5);
                add(tf2);
                
                btnAdd=new Button("Add");
                btnSub=new Button("Subtract");
                btnMul=new Button("Multiply");
                btnDiv=new Button("Divide");
                btnClear=new Button("Clear");
                
                add(btnAdd);
                add(btnSub);
                add(btnMul);
                add(btnDiv);
                
                btnAdd.addActionListener(this);
                btnSub.addActionListener(this);
                btnMul.addActionListener(this);
                btnDiv.addActionListener(this);
                
                add(new Label("Result:"));
                tfResult=new TextField(5);
                tfResult.setEditable(false);
                add(tfResult);
                
                add(btnClear);
                btnClear.addActionListener(this);
                
                setTitle("Simple AWT Calculator");
                setSize(400,200);
                setVisible(true);
                
                addWindowListener(new WindowAdapter()
                {
                        public void windowClosing(WindowEvent we)
                        {
                                dispose();
                        }
                });
        }
        
        public void actionPerformed(ActionEvent e)
        {
                try
                {
                        double num1=Double.parseDouble(tf1.getText());
                        double num2=Double.parseDouble(tf2.getText());
                        double result=0;
                        
                        if(e.getSource()==btnAdd)
                        {
                                result=num1+num2;
                        }
                        else if(e.getSource()==btnSub)
                        {
                                result=num1-num2;
                        }
                        else if(e.getSource()==btnMul)
                        {
                                result=num1*num2;
                        }
                        else if(e.getSource()==btnDiv)
                        {
                                if(num2==0)
                                {
                                        tfResult.setText("cannot divide by zero");
                                        return;
                                }
                                result=num1/num2;
                         }
                         else if(e.getSource()==btnClear)
                         {
                                tf1.setText("");
                                tf2.setText("");
                                tfResult.setText("");
                                return;
                         }
                         
                         tfResult.setText(String.valueOf(result));
                  }
                  catch(NumberFormatException ex)
                  {
                        tfResult.setText("Invalid input");
                  }
         }
         
         public static void main(String args[])
         {
                new SimpleCalculator();
         }
 }
