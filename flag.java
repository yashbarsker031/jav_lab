import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
class FDemo extends Frame
{
FDemo()
{
}
public void paint(Graphics g)
{
try{Thread.sleep(1000);} catch (Exception e){}
	g.fillRect(100,100,10,450);
	g.fillRect(100,100,10,450);
	g.setColor(Color.black);
	try{Thread.sleep(1000);} catch (Exception e){}
	
	g.fillRect(80,550,50,10);
	g.fillRect(70,560,70,10);
	g.fillRect(60,570,90,10);
	try{Thread.sleep(1000);} catch (Exception e){}
	g.setColor(Color.orange);
	
	try{Thread.sleep(1000);} catch (Exception e){}
	g.fillRect(110,110,200,45);
	g.setColor(Color.white);
	
	try{Thread.sleep(1000);} catch (Exception e){}
	g.fillRect(110,155,200,45);
	g.setColor(Color.green);
	
	try{Thread.sleep(1000);} catch (Exception e){}
	g.fillRect(110,200,200,45);
	
	try{Thread.sleep(1000);} catch (Exception e){}
	g.setColor(Color.blue);
	
	try{Thread.sleep(1000);} catch (Exception e){}
	g.drawOval(185,158,40,40);
	
	try{Thread.sleep(1000);} catch (Exception e){}
	double a=0;
		for(int i=1;i<=24;i++)
		{
			double d=a*3.14/180;
			int x2=(int)(205+20*Math.cos(d));
			int y2=(int)(178+20*Math.sin(d));
			try{Thread.sleep(1000);} catch (Exception e){}
			g.drawLine(205,178,x2,y2);
			a=a+15;
			
			
			
		}

}
}
class Demo43
{
public static void main(String ar[])
{
FDemo f=new FDemo();
f.setVisible(true);
f.setSize(700,600);
f.setLocation(200,100);
f.setBackground(Color.cyan);
//f.setForeground(Color.black);
}
}