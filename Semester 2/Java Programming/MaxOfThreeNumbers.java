import java.awt.*;
import java.awt.event.*;
public class MaxOfThreeNumbers extends Frame implements ActionListener {
 TextField num1, num2, num3, result;
 Button findMax;
 public MaxOfThreeNumbers() {
 setLayout(new FlowLayout());
 num1 = new TextField(10);
 num2 = new TextField(10);
 num3 = new TextField(10);
 result = new TextField(10);
 result.setEditable(false);
 add(new Label("Number 1: "));
 add(num1);
 add(new Label("Number 2: "));
 add(num2);
 add(new Label("Number 3: "));
 add(num3);
 findMax = new Button("Find Max");
 add(findMax);
 add(new Label("Maximum: "));
 add(result);
 findMax.addActionListener(this);
 setTitle("Find Maximum of Three Numbers");
 setSize(250, 200);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent ae) {
 int number1 = Integer.parseInt(num1.getText());
 int number2 = Integer.parseInt(num2.getText());
 int number3 = Integer.parseInt(num3.getText());
 int max = Math.max(number1, Math.max(number2, number3));
 result.setText(String.valueOf(max));
 }
 public static void main(String[] args) {
 new MaxOfThreeNumbers();
 }
}
