import java.awt.*;
import  java.awt.event.*;
class Demo24 extends Frame
{
	Demo24()
	{
		setVisible(true);
		setSize(700,600);
		setLocation(300,100);
		setBackground(Color.black);
		setForeground(Color.yellow);
		Font f=new Font("Andalus",Font.BOLD,30);
		setFont(f);
		addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}
	
	public void paint(Graphics g)
	{	
	g.setColor(Color.white);
	int x=100;
	int y=100;
	int w=100;
	int h=100;
	int sa=0;
	int ma=30;
	for(int i=1;i<=12;i++)
	{
		
g.fillArc(x,y,w,h,sa,ma);
sa=sa+30;
try{Thread.sleep(200);}catch(Exception e){}

	}
	


	}
	
	public static void main(String ar[])
	{
		Demo24 d=new Demo24();
	
	}
}