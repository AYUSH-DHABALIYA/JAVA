package cafe_system;

import java.awt.*;  
import javax.swing.*;


import com.a203.BackgroundIMage;

 

public class Page_1 extends Canvas{ 
	
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("D://jane.jpg");  
        g.drawImage(i, 0, 0, 1000, 600, this);
        
    }
        	
	

	public Page_1()
	{
		JFrame frame;
		JLabel l1, l2, l3, l4,l5,l6,l7;
		JTextField tf1, tf2;
		JButton b1,b2,b3,b4;
		
		
		frame = new JFrame();
		BackgroundIMage m=new BackgroundIMage();
		l1 = new JLabel("THE GREAT INDIAN RESTAURANT");
		l1.setBounds(140,25,300,30);
		l1.setFont(new Font("xyz",Font.ITALIC,15));
		b1 = new JButton("Sign up");
		b1.setBounds(100,200,170,20);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b2 = new JButton("Continue with Google");
		b2.setBounds(140,250,190,20);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		b3 = new JButton("Continue with Facebook");
		b3.setBounds(140,280,190,20);	
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b4 = new JButton("Purchase membership");
		b4.setBounds(140,310,190,20);	
		b4.setBackground(Color.orange);
		b4.setForeground(Color.white);
		l2 = new JLabel("Not a member? Register now");
		l2.setBounds(165, 600, 230, 25);
		l2.setFont(new Font("Not a member? Reigster now",Font.BOLD,15));
		l2.setForeground(Color.blue);
		l3 = new JLabel("Enter your gmail");
		l3.setBounds(50, 100, 150, 14);
		l1.setFont(new Font("Enter your gamil",Font.BOLD,16));
		l4 = new JLabel("Enter your password");
		l4.setBounds(50, 150, 150, 14);
		l5 = new JLabel("Hungry ?");
		l5.setBounds(10,400,200,50);
		l5.setFont(new Font("xyz",Font.ITALIC,35));
		l6 = new JLabel("Order now..!");
		l6.setBounds(10,440,200,50);
		l6.setFont(new Font("xyz",Font.CENTER_BASELINE,18));
		l7 = new JLabel("COOK it with CARE..");
		l7.setBounds(10,500,250,50);
		l7.setFont(new Font("xyz",Font.CENTER_BASELINE,20));
		l1.setFont(new Font("Password",Font.BOLD,16));
		tf1 = new JTextField();
		tf1.setBounds(200, 100, 130, 20);
		tf2 = new JTextField();
		tf2.setBounds(200, 150, 130, 20);
		
		frame.add(l1);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(m);
		frame.setSize(1400,690);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Page_1();
	}
	}


