
import java.awt.*;
import java.awt.event.*;
public class MyList extends Frame implements ItemListener{
String msg="";
List Lst;
Panel apanel;
Label alabel;
MyList()
{
setLayout(new FlowLayout());
alabel=new Label("Cities");
alabel.setAlignment(Label.CENTER);
Lst= new List();
Lst.add("Indore");
Lst.add("Ujjaain");
Lst.add("Bopal");
Lst.add("Jabalpur");
Lst.addItemListener(this);
apanel=new Panel();
apanel.add(alabel);
apanel.add(Lst);
apanel.setBackground(Color.GRAY);
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
g.drawString("Selected Language",15,120);
msg=Lst.getSelectedItem();
g.drawString(msg,160,260);
}
public static void main(String[] args) {
MyList d =new MyList();
d.setSize(400,400);
d.setTitle("MyList");
d.setVisible(true);
d.addWindowListener(new exit1());
}
}
class exit1 extends WindowAdapter{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}