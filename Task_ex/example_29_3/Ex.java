// Write a program to make a square and cube of number.
package example_29_3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class Ex {
	
	public Ex()
	{
		JFrame frame;
		JTextField tf1;
		JButton b1;
		JLabel l1;
		
		frame = new JFrame();
		
		l1 = new JLabel("Please enter ok to continue");
		l1.setBounds(220, 55, 200, 14);
		
		tf1 = new JTextField();
		tf1.setBounds(260, 102, 96, 20);
		
		b1 = new JButton("Ok");
		b1.setBounds(260, 156, 89, 23);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
				   LocalDateTime now = LocalDateTime.now();  
				    JOptionPane.showMessageDialog(frame,dtf.format(now));
					
				
			}
		});
		
		
		frame.add(l1);
		frame.add(tf1);
		frame.add(b1);
		frame.setSize(668, 334);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new Ex();
		
	}

}
