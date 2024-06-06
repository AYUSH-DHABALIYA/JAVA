import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DeleteFrame 
{
	JFrame frame;
	JTextField tf;
	JButton btn1;
	public DeleteFrame() 
	{
	// TODO Auto-generated constructor stub
	
		frame = new JFrame();
		
		tf = new JTextField(20);
		btn1 = new JButton("Delete");
		
		frame.add(tf);
		frame.add(btn1);
		frame.setSize(350,350);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
}
