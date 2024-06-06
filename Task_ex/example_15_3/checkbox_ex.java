package example_15_3;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class checkbox_ex {
	
	JFrame frame;
	JCheckBox chk1, chk2, chk3, chk4;
	JButton b1,b2,b3,b4,b5;
	
	public checkbox_ex()
	{
		frame = new JFrame();
		
		
		chk1 = new JCheckBox("CheckBox - 1");
		chk1.setBounds(30, 39, 150, 25);
		chk1.setFont(new Font("xyz",Font.BOLD,16));
		
		chk2 = new JCheckBox("CheckBox - 2");
		chk2.setBounds(180,39, 150, 25);
		chk2.setFont(new Font("xyz",Font.BOLD,16));
		
		chk3 = new JCheckBox("CheckBox - 3");
		chk3.setBounds(330, 39, 150, 25);
		chk3.setFont(new Font("xyz",Font.BOLD,16));
		
		chk4 = new JCheckBox("CheckBox - 4");
		chk4.setBounds(480, 39, 150, 25);
		chk4.setFont(new Font("xyz",Font.BOLD,16));
		
		b1 = new JButton("Submit");
		b1.setBounds(275, 350, 100, 23);
		
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			 if (chk1.isSelected()) {
				frame.add(b2);
				b2.setBounds(30, 150, 100, 30);
				
			}
			 else if (chk2.isSelected()) {
				frame.add(b2);
				b2.setBounds(180, 150, 100, 30);
				frame.add(b3);
				b3.setBounds(180, 200, 100, 30);
			}
			 else if (chk3.isSelected()) {
				frame.add(b2);
				b2.setBounds(330, 150, 100, 30);
				frame.add(b3);
				b3.setBounds(330, 200, 100, 30);
				frame.add(b4);
				b4.setBounds(330, 250, 100, 30);
				
			}
			 else if (chk4.isSelected()) {
				frame.add(b2);
				b2.setBounds(480, 150, 100, 30);
				frame.add(b3);
				b3.setBounds(480, 200, 100, 30);
				frame.add(b4);
				b4.setBounds(480, 250, 100, 30);
				frame.add(b5);
				b5.setBounds(480, 300, 100, 30);
			}
			
			}
		});
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(chk4);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.setSize(700,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new checkbox_ex();

	}

}
