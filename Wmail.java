//compile this code wherever u want. 
 import java.io.*;
import java.lang.*;
 import java.util.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
	
	
public class WMail extends JFrame implements ActionListener
{
	JFrame f1,f2,f3,f4,f5,f6;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1,b2,b3,b4,b5;
  WMail()
  {
	  f1=new JFrame("frame 1");
	  
	  l1=new JLabel("Enter function (SignUp, Login, Compose):");
	  l1.setBounds(100,100,1000,50);
	  f1.add(l1);
	  
	  
	  tf1=new JTextField();
	  tf1.setBounds(100,170,200,30);
	  f1.add(tf1);
	  
	  b1=new JButton("Enter");
	  b1.setBounds(100,210,200,30);
	  f1.add(b1);
	 b1.addActionListener(this);
	  
	  f1.setSize(500,500);
	  f1.setLayout(null);
	  f1.setVisible(true);
	  
	  
	  
   /* InputStreamReader I=new InputStreamReader(System.in);
    BufferedReader B=new BufferedReader(I);
    System.out.print("Enter function (SignUp, Login, Compose): ");
    String ch=B.readLine();
    
    if(ch.equals("signup"))
    {
    
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.print("Username@wmail.com: ");
    java.lang.String User=input.readLine();
    System.out.print("Password: ");
    java.lang.String Pass=input.readLine();
    
    System.out.println("New ID created successfully!");
    
    FileWriter fout=new FileWriter(User+"@wmail.com");
    BufferedWriter bout=new BufferedWriter(fout);
    PrintWriter pout=new PrintWriter(bout);
    pout.println(Pass);
    
    FileWriter fot=new FileWriter(User);
    BufferedWriter bot=new BufferedWriter(fot);
    PrintWriter pot=new PrintWriter(bot);
    
    pout.close();
    bout.close();
    pout.close();
    }
    
    else
    if(ch.equals("login"))
    {
  
   
    
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.print("Username: ");
    java.lang.String User=input.readLine();
    System.out.print("Password: ");
    java.lang.String Pass=input.readLine();
    
    FileReader fout=new FileReader(User+"@wmail.com");
    BufferedReader bout=new BufferedReader(fout);
    
    java.lang.String data=bout.readLine();
    if(Pass.equals(data))
    {
    System.out.println("Logged On!");
    System.out.print("Do you want to go to the inbox: (yes/no)");
    java.lang.String Ask=input.readLine();
    if(Ask.equals("yes"))
    {
    FileReader f=new FileReader(User);
    BufferedReader b=new BufferedReader(f);
    System.out.println("");
    java.lang.String Composed;
    int i=0;
    while((Composed=b.readLine())!=null)
    {
    i++;
    System.out.println(Composed);
    }
    System.out.println("");
    b.close();
    bout.close();
    }
   

    }
    else
    {
    System.out.println("Wrong password!");
    }
    }
    
    else
    if(ch.equals("compose"))
    {
    
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    Calendar c=Calendar.getInstance();
    
    System.out.print("Username: ");
    java.lang.String User1=input.readLine();
    System.out.print("Password: ");
    java.lang.String Pass=input.readLine();
    
    FileReader fout=new FileReader(User1+"@wmail.com");
    BufferedReader bout=new BufferedReader(fout);
    
    java.lang.String data=bout.readLine();
    if(Pass.equals(data))
    {
    System.out.println("Logged On!");
    
    System.out.print("To:   ");
    java.lang.String User=input.readLine();
    
    System.out.print("From:   ");
    java.lang.String From=input.readLine();
    System.out.println("");
    System.out.println("Letter Content:");
    java.lang.String Body=input.readLine();
    
    FileWriter fin=new FileWriter(User);
    BufferedWriter bin=new BufferedWriter(fin);
    PrintWriter pin=new PrintWriter(bin);
    System.out.println("");
    pin.println("Time:"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" PM");
    pin.println("From "+From+",");
    pin.println(Body);
    System.out.println("");
    System.out.println("Mail sent!");
    bout.close();
    pin.close();
    bin.close();
    pin.close();
    }
    else
    {
    System.out.println("Wrong password!");
    }
    
  
    }
    else
    System.out.println("Wrong choice!");
    }*/
}
String data;
String Composed;

public void actionPerformed(ActionEvent ae)
{
	String ch;
	if(ae.getSource()==b1)
	{
		ch=tf1.getText();
		 if(ch.equals("signup"))
    {
		
		
		f2=new JFrame("signup");
		
		l2=new JLabel("Signup");
		l2.setBounds(50,100,500,30);
		f2.add(l2);
		
		
		l2=new JLabel("Enter the user name:");
		l2.setBounds(50,150,500,30);
		f2.add(l2);
		
		tf2=new JTextField();
		tf2.setBounds(50,180,200,30);
		f2.add(tf2);
		
		
		
		l3=new JLabel("Enter the password:");
		l3.setBounds(50,210,500,30);
		f2.add(l3);
		
		tf3=new JTextField();
		tf3.setBounds(50,250,200,30);
		f2.add(tf3);
		
		
		b2=new JButton("Singnup");
		b2.setBounds(50,300,200,30);
		f2.add(b2);
		
		b2.addActionListener(this);
		
		
		
		
		
		
		
		
		
		
		
		
		
		f2.setLayout(null);
		f2.setSize(500,500);
		f2.setVisible(true);
    
    
    }
	
	
	
	
	else
    if(ch.equals("login"))
    {
  
   f4=new JFrame("frame 4");
   f4.setSize(500,500);
   
   
   
   
   
   
   
   		l4=new JLabel("Enter the user name:");
		l4.setBounds(50,150,500,30);
		f2.add(l4);
		
		tf4=new JTextField();
		tf4.setBounds(50,180,200,30);
		f4.add(tf4);
		
		
		
		l5=new JLabel("Enter the password:");
		l5.setBounds(50,210,500,30);
		f4.add(l5);
		
		tf5=new JTextField();
		tf5.setBounds(50,250,200,30);
		f4.add(tf5);
		
		
		b4=new JButton("Signin");
		b4.setBounds(50,300,200,30);
		f4.add(b4);
		
		b4.addActionListener(this);
   
   
   
   
   
   
   
  
    
   
	
	
	
	
	
	
	
	
	 f4.setLayout(null);
   f4.setVisible(true);
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	
	
	if(ae.getSource()==b4)
	{
		
		
		String User;
		String Pass;
		User=tf4.getText();
		Pass=tf5.getText();
		try{
		 InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
   // System.out.print("Username: ");
    //java.lang.String User=input.readLine();
    //System.out.print("Password: ");
    //java.lang.String Pass=input.readLine();
    
    FileReader fout=new FileReader(User+"@wmail.com");
    BufferedReader bout=new BufferedReader(fout);
    
    java.lang.String data=bout.readLine();
		}
		catch(Exception e)
		{
		}
    if(Pass.equals(data))
    {
		
		
    System.out.println("Logged On!");
	
	f5=new JFrame("frame 5");
	
	
	l6=new JLabel("Logged on!");
	l6.setBounds(100,100,200,30);
	f5.add(l6);
	
	
	l7=new JLabel("Do you want to go to the inbox: (yes/no)");
	l7.setBounds(100,150,200,30);
	f5.add(l7);
	
	String Ask;
	tf6=new JTextField();
	tf6.setBounds(100,200,200,30);
	f5.add(tf6);
	
	
	
	
	
	
	
	
	
	
    System.out.print("Do you want to go to the inbox: (yes/no)");
   // java.lang.String Ask=input.readLine();
   
   
   
   
   f5.setLayout(null);
   f5.setSize(500,500);
	f5.setVisible(true);
	
	
	
   
    }
	else{
		System.out.println("haii");
	}
	

   

    }
    
    }
	
	
	
    
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	if(ae.getSource()==b2)
	{
		
		try
		{
		
		
		String User=tf2.getText();
		String Pass=tf2.getText();
		f3=new JFrame("frame 3");
		f3.setLayout(null);
		
		
		
		InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    //System.out.print("Username@wmail.com: ");
    //java.lang.String User=input.readLine();
    //System.out.print("Password: ");
    //java.lang.String Pass=input.readLine();
    
    System.out.println("New ID created successfully!");
    
    FileWriter fout=new FileWriter(User+"@wmail.com");
    BufferedWriter bout=new BufferedWriter(fout);
    PrintWriter pout=new PrintWriter(bout);
    pout.println(Pass);
    
    FileWriter fot=new FileWriter(User);
    BufferedWriter bot=new BufferedWriter(fot);
    PrintWriter pot=new PrintWriter(bot);
    
    pout.close();
    bout.close();
    pout.close();
	
	l3=new JLabel("New ID created successfully!");
	l3.setBounds(50,100,500,30);
	f3.add(l3);
		
		f3.setSize(500,500);
		f3.setVisible(true);
		
		}catch(Exception e)
		{
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



	public static void main(String args[])
	{
		new WMail();
		
	}
	
	
    }