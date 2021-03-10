
import java.awt.*;
import java.awt.event.*;
public class TextBox extends Frame {
public static void main(String[] args) {
TextBox d =new TextBox();
d.setSize(400,400);
d.setTitle("editor");
d.setVisible(true);
Panel p=new Panel();
d.add(p);
Label l= new Label("your name",Label.CENTER);
p.add(l);
TextField tf=new TextField(10);
p.add(tf);
d.addWindowListener(new NewClass());
}
}
class NewClass extends WindowAdapter{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
