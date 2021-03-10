import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
FDemo()
   {
	  
setLayout(new FlowLayout());
Font f=new Font("Arial Unicode MS",Font.ITALIC,25); 
setFont(f);
 b1=new Button("Black");
add(b1);
 b2=new Button("Blue");
add(b2);
b3=new Button("Green");
add(b3);
b4=new Button("White");
add(b4);
b5=new Button("Orange");
add(b5);
 b6=new Button("Voilet");
add(b6);
b7=new Button("Yellow");
add(b7);
b8=new Button("Red");
add(b8);
 b9=new Button("Purple");
add(b9);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
    }
  public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==b1)
	   {
	   setBackground(Color.black);
	   }
	   if(e.getSource()==b2)
	   {
	   setBackground(Color.blue);
	   }
	   if(e.getSource()==b3)
	   {
	   setBackground(Color.green);
	   }
	   if(e.getSource()==b4)
	   {
	   setBackground(Color.white);
	   }
	   if(e.getSource()==b5)
	   {
	   setBackground(Color.orange);
	   }
	   if(e.getSource()==b6)
	   {
	   setBackground(Color.cyan);
	   }
	   if(e.getSource()==b7)
	   {
	   setBackground(Color.yellow);
	   }
	   if(e.getSource()==b8)
	   {
	   setBackground(Color.red);
	   }
	   if(e.getSource()==b9)
	   {
	   setBackground(Color.magenta);
	   }
    }
}
class Demo63
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setLocation(100,200);
f.setSize(700,600);
//f.setBackground(Color.red);
//f.setForeground(Color.black);
}
}