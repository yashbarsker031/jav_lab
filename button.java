import java.awt.*;
import java.awt.event.*;
public class Mybutton extends Frame implements ActionListener{
Button b1;
Button b2;
Mybutton(){
this.setLayout(null);
b1= new Button("Yellow");
b2= new Button("Yel");
b1.setBounds(100,100,75,45);
b2.setBounds(100,150,75,45);
this.add(b1);
this.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
addWindowListerner(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}
private void addWindowListerner(WindowAdapter windowAdapter) {
// TODO Auto-generated method stub
}
private void addActionListener(Mybutton mybutton) {
// TODO Auto-generated method stub
}
@Override
public void actionPerformed(ActionEvent e) {
String str= e.getActionCommand();
if(str.equals("yellow"))this.setBackground(Color.yellow);
if(str.equals("yel"))this.setBackground(Color.red);
}
public static void main(String[] args) {
Mybutton d =new Mybutton();
d.setSize(400,400);
d.setTitle("Mybutton wit action");
d.setVisible(true);
}
}