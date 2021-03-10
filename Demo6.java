import java.awt.*;

import java.awt.event.*;
import java.awt.event.*;

 

class newFrame extends Frame implements ActionListener,ItemListener
{
Label form;
Label l1,l2,l3,l4,l5,l6,l7,l8;

TextField text1,text2,text3,text4,text5;

Button button;

Choice jcombo,jcombo1,jcombo2;

Checkbox jRadio1,jRadio2;
CheckboxGroup radios;

Checkbox jcheckbox1,jcheckbox2,jcheckbox3,jcheckbox4;

TextArea jtextarea1;
String radio="";
String s18=" ";

String s20=" ";

String s22=" ";

String s24=" ";
newFrame( )
{
form=new Label("FORM");

form.setSize(80,20);

form.setLocation(180,35);

add(form);

 

l1=new Label("NAME");

l1.setSize(80,20);

l1.setLocation(10,90);

add(l1);

 

text1=new TextField();

text1.setSize(150,20);

text1.setLocation(100,90);

add(text1);

 

 

l2=new Label("Last Name");

l2.setSize(80,20);

l2.setLocation(10,120);

add(l2);
 

text2=new TextField(15);

text2.setSize(150,20);

text2.setLocation(100,120);

add(text2);
 

l3=new Label("E Mail");

l3.setSize(80,20);

l3.setLocation(10,150);

add(l3);
 

text3=new TextField(15);

text3.setSize(150,20);

text3.setLocation(100,150);

add(text3);

 

 

l4=new Label("Contact No.");

l4.setSize(80,20);

l4.setLocation(10,180);

add(l4);
 

text4=new TextField(15);

text4.setSize(150,20);

text4.setLocation(100,180);

add(text4);
 

l5=new Label("Address");

l5.setSize(80,20);

l5.setLocation(10,210);

add(l5);
 

text5=new TextField(15);

text5.setSize(150,20);

text5.setLocation(100,210);

add(text5);

 

 

l6=new Label("Date");

l6.setSize(80,20);

l6.setLocation(10,240);

add(l6);

 

jcombo= new Choice();

jcombo.addItem("1");

jcombo.addItem("2");

jcombo.addItem("3");

jcombo.addItem("4");

jcombo.addItem("5");

jcombo.addItem("6");

jcombo.addItem("7");

jcombo.addItem("8");

jcombo.addItem("9");

jcombo.addItem("10");

jcombo.addItem("11");

jcombo.addItem("12");

jcombo.addItem("13");

jcombo.addItem("14");

jcombo.addItem("15");

jcombo.addItem("16");

jcombo.addItem("17");

jcombo.addItem("18");

jcombo.addItem("19");

jcombo.addItem("20");

jcombo.addItem("21");

jcombo.addItem("22");

jcombo.addItem("23");

jcombo.addItem("24");

jcombo.addItem("25");

jcombo.addItem("26");

jcombo.addItem("27");

jcombo.addItem("28");

jcombo.addItem("29");

jcombo.addItem("30");

jcombo.addItem("31");

jcombo.setSize(50,20);

jcombo.setLocation(100,240);

add(jcombo);
 

 

jcombo1= new Choice();

jcombo1.addItem("1");

jcombo1.addItem("2");

jcombo1.addItem("3");

jcombo1.addItem("4");

jcombo1.addItem("5");

jcombo1.addItem("6");

jcombo1.addItem("7");

jcombo1.addItem("8");

jcombo1.addItem("9");

jcombo1.addItem("10");

jcombo1.addItem("11");

jcombo1.addItem("12");

jcombo1.setSize(50,20);

jcombo1.setLocation(150,240);

add(jcombo1);
 

jcombo2= new Choice();

jcombo2.addItem("2001");

jcombo2.addItem("2002");

jcombo2.addItem("2003");

jcombo2.addItem("2004");

jcombo2.addItem("2005");

jcombo2.addItem("2006");

jcombo2.addItem("2007");

jcombo2.addItem("2008");

jcombo2.addItem("2009");

jcombo2.addItem("2010");

jcombo2.addItem("2011");

jcombo2.addItem("2012");

jcombo2.addItem("2013");
jcombo2.addItem("2014");
jcombo2.addItem("2014");
jcombo2.addItem("2016");
jcombo2.addItem("2017");
jcombo2.addItem("2018");
jcombo2.addItem("2019");
jcombo2.addItem("2020");
jcombo2.addItem("2021");
jcombo2.setSize(50,20);

jcombo2.setLocation(200,240);

add(jcombo2);

 

 

 

l7=new Label("Gender");

l7.setSize(80,20);

l7.setLocation(10,270);

add(l7);
 

radios = new CheckboxGroup( );

jRadio1= new Checkbox("Male", false , radios);

jRadio2= new Checkbox("Female", false , radios);
 

jRadio1.setSize(75,30);

jRadio1.setLocation(100,270);

add(jRadio1);

 

jRadio2.setSize(75,30);

jRadio2.setLocation(175,270);

add(jRadio2);
 

 

l8=new Label("Language");

l8.setSize(80,20);

l8.setLocation(10,310);

add(l8);
 

jcheckbox1 = new Checkbox("C");

jcheckbox1.setSize(75,30);

jcheckbox1.setLocation(100,310);

add(jcheckbox1);
jcheckbox2 = new Checkbox("C++");

jcheckbox2.setSize(75,30);

jcheckbox2.setLocation(175,310);

add(jcheckbox2);
jcheckbox3 = new Checkbox("Java");

jcheckbox3.setSize(75,30);

jcheckbox3.setLocation(100,340);

add(jcheckbox3);
jcheckbox4 = new Checkbox("J2EE");

jcheckbox4.setSize(75,30);

jcheckbox4.setLocation(175,340);

add(jcheckbox4);

 

 

 

 

 

 

 

button=new Button("Submit");

button.setSize(120,30);

button.setLocation(100,390);

add(button);
 

 

jtextarea1 = new TextArea();

jtextarea1.setSize(260,270);

jtextarea1.setLocation(300,100);

add(jtextarea1);

 

button.addActionListener(this);

jRadio1.addItemListener(this);
jRadio2.addItemListener(this);

 

jcheckbox1.addItemListener(this);

jcheckbox2.addItemListener(this);

jcheckbox3.addItemListener(this);

jcheckbox4.addItemListener(this);

 

}
public void paint(Graphics g) 
{
setBackground(Color.yellow);

form.setBackground(Color.yellow);

l1.setBackground(Color.yellow);

l2.setBackground(Color.yellow);

l3.setBackground(Color.yellow);

l4.setBackground(Color.yellow);

l5.setBackground(Color.yellow);

l6.setBackground(Color.yellow);

l7.setBackground(Color.yellow);

l8.setBackground(Color.yellow); 
jRadio1.setBackground(Color.yellow);

jRadio2.setBackground(Color.yellow); 
jcheckbox1.setBackground(Color.yellow);

jcheckbox2.setBackground(Color.yellow);

jcheckbox3.setBackground(Color.yellow);

jcheckbox4.setBackground(Color.yellow);
button.setBackground(Color.green); 
 

}

 

public void itemStateChanged(ItemEvent e1)
{

if(e1.getItemSelectable()==jRadio1)
{

radio="Male";
}
else{

radio="FeMale";

}

if(e1.getItemSelectable()==jcheckbox1)
{

s18="C";

}

if(e1.getItemSelectable()==jcheckbox2)
{
s20="C++";

}

if(e1.getItemSelectable()==jcheckbox3)
{
s22="JAVA";
}

if(e1.getItemSelectable()==jcheckbox4)
{

s24="J2EE";

}

}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==button)
{
String s=text1.getText();

String s9="\n";
String s1=text2.getText();

String s2=text3.getText();

String s3=text4.getText();

String s4=text5.getText();
s=s.concat(s9);

String s5=s.concat(s1);

s5=s5.concat(s9);

String s6=s5.concat(s2);

s6=s6.concat(s9);

String s7=s6.concat(s3);

s7=s7.concat(s9);

String s8=s7.concat(s4);

s8=s8.concat(s9);
String s10=(String)jcombo.getSelectedItem();

String s11=s8.concat(s10);

s11=s11.concat(s9);

String s12=(String)jcombo1.getSelectedItem();

String s13=s11.concat(s12);

s13=s13.concat(s9);

String s14=(String)jcombo2.getSelectedItem();

String s15=s13.concat(s14);

s15=s15.concat(s9);
String s17=s15.concat(radio);
s17=s17.concat(s9);
String s19=s17.concat(s18);
s19=s19.concat(s9);
String s21=s19.concat(s20);
s21=s21.concat(s9);
String s23=s21.concat(s22);

s23=s23.concat(s9);

 

String s25=s23.concat(s24);

 

 

jtextarea1.setText(s25);

 

}

}

}

class Demo6

{

public static void main(String args[])

{

newFrame f=new newFrame( ) ;

f.setSize(600,500);

f.setLayout(null);

f.setVisible(true);
f.setLocation(200,150);
f.setResizable(false);

f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}

}