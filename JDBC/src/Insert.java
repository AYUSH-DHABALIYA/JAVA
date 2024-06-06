import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Insert {

	JFrame frame;
	JTextField tf1, tf2;
	JButton b1;

	
	public void Insert() {

		frame = new JFrame();
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		b1 = new JButton("INSERT");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String host = "jdbc:mysql://localhost:3306/";
				String  db= "company";
				String  url = host+db;
				
				String n = tf1.getText().toString();
				String s = tf2.getText().toString();

				int s2 = Integer.parseInt(s);
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection cn = DriverManager.getConnection(url,"root", "");
					
					String sql = "insert into product(pname,pprice) values('"+n+"','"+s2+"')";
					
					Statement sm = cn.createStatement();
					int data = sm.executeUpdate(sql);
					
					if (data> 0) 
					
					{
						frame.setVisible(false);
						
					} 
					else
					{
						System.out.println("Error");
					}
				}
				
				catch (Exception e2)
				
				{
					e2.printStackTrace();
			}
			}
		});
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(b1);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	
	
	}
}

