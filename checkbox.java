import java.awt.*;
import java.awt.event.*;
public class Checkbox extends Frame implements ItemListener{
String msg="";
CheckboxGroup cb;
Checkbox y,n;
Checki()
{
setLayout(new FlowLayout());
cb=new CheckboxGroup();
y= new Checkbox("Yes",cb,true);
n= new Checkbox("no",cb,false);
Label l= new Label("your name",Label.CENTER);
TextField tf=new TextField(25);
add(y);
add(n);
add(l);
add(tf);
y.addItemListener(this);
n.addItemListener(this);
addWindowListener(new WindowAdapter()
{
public void WindowClosing(WindowEvent we)
{
System.exit(0);
}
});
}
private void addWindowListener(WindowAdapter windowAdapet) {
// TODO Auto-generated method stub
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
msg="Present status";
msg+= cb.getSelectedCheckbox().getLabel();
g.drawString(msg,15,120);
}
public static void main(String[] args) {
Checki d =new Checki();
d.setSize(400,400);
d.setTitle("editor");
d.setVisible(true);
d.addWindowListener(new NewClass());
}
}