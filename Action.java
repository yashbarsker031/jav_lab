import java.awt.*;
import java.awt.event.*;
public class Actione {
Frame f1=new Frame();
Button b1= new Button("click");
TextField tf1=new TextField(50);
Actione()
{
f1.setLayout(new FlowLayout());
f1.add(tf1);
f1.add(b1);
A a1=new A(tf1);
b1.addActionListener(a1);
f1.setSize(450,450);
f1.setVisible(true);
}
public static void main(String[] args) {
Actione a =new Actione();
}
class A implements ActionListener
{
TextField tf;
A (TextField tf)
{
this.tf= tf;
}
public void actionPerformed(ActionEvent ae)
{
tf.setText("Sonali ");
}
}
class NewClass extends WindowAdapter{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
}
