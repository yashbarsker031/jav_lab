import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame
{

	FrameDemo()
	{

	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		int x1=100;
		int y1=100;
		int x2=100;
		int y2=100;
for(int i=1;i<=200;i++)
{
	try
	{
		Thread.sleep(20);
	}
	catch(Exception e){}
	g.drawLine(x1+=1,y1,x2,y2);
}	
		g.setColor(Color.red);
for(int i=1;i<=200;i++)
{
	try
	{
		Thread.sleep(20);
	}
	catch(Exception e){}
	g.drawLine(x1,y1+=1,x2,y2);
}	
		g.setColor(Color.pink);
for(int i=1;i<=200;i++)
{
	try
	{
		Thread.sleep(20);
	}
	catch(Exception e){}
	g.drawLine(x1-=1,y1,x2,y2);
}	
	}
	
	}
	
class Demo3
{
	public static void main(String[] ar)
	{
		 FrameDemo f=new  FrameDemo();
		 	 f.setVisible(true);
		 f.setSize(700,700);
		 f.setLocation(200,100);
		 
}	}