import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example_26 implements ActionListener {

	JFrame frame;
	 JButton insert,view,update,delete;
	
	 Example_26() {
		// TODO Auto-generated constructor 

		frame = new JFrame();
		
		
		insert = new JButton("insert");
		view = new JButton("view");
		update = new JButton("update");
		delete = new JButton("delete");
		
		insert.addActionListener(this);

		
		
		frame.add(insert);
		frame.add(view);
		frame.add(update);
		frame.add(delete);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example_26();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Insert a = new Insert();
		// TODO Auto-generated method stub
		if(e.getSource()== insert)
		{
			a.Insert();
		}
	
	}

}
