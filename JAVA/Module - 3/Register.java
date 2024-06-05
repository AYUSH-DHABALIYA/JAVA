import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Register implements ActionListener {
	
	JFrame frame;
	JTextField tf1,tf2,tf3,tf4;
	JLabel lid,lname,ladd,lcont,lregi,lgen;
	JRadioButton male, female;
	JButton jbexit, jbregister,jbdel,jbupdate,jbreset,jbrefresh;
	JTable jt;
	JScrollPane jscroll;
	
	DefaultTableModel model;
		
	Font font = new Font("Times new Roman", Font.BOLD, 60);
	
	public Register() {
		
		
		
		frame = new JFrame("REGISTRATION FORM");
		
		// text field setting
		tf1 = new JTextField(15);
		tf1.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,13));
		tf1.setBounds(130, 49, 167, 34);
		tf2 = new JTextField(15);
		tf2.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,13));
		tf2.setBounds(130, 87, 167, 34);
		tf3 = new JTextField(15);
		tf3.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,13));
		tf3.setBounds(130, 175, 167, 34);
		tf4 = new JTextField(15);
		tf4.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,13));
		tf4.setBounds(130, 215, 167, 34);
		
		// label setting
		lid = new JLabel("ID");
		lid.setFont(new Font("Tahoma", Font.BOLD,13));
		lid.setBounds(35, 58, 60, 16);
		lname = new JLabel("Name");
		lname.setFont(new Font("Tahoma", Font.BOLD,13));
		lname.setBounds(35, 96, 60, 16);
		ladd = new JLabel("Address");
		ladd.setFont(new Font("Tahoma", Font.BOLD,13));
		ladd.setBounds(35, 184, 60, 16);
		lcont = new JLabel("Contact");
		lcont.setFont(new Font("Tahoma", Font.BOLD,13));
		lcont.setBounds(35, 224, 60, 16);
		lregi = new JLabel("Registration Form");
		lregi.setFont(new Font("Tahoma", Font.BOLD,13));
		lregi.setBounds(61, 13, 157, 23);
		lgen = new JLabel("Gender");
		lgen.setFont(new Font("Tahoma", Font.BOLD,13));
		lgen.setBounds(35, 139, 64, 25);
		
		// radio button setting
		male = new JRadioButton("Male");
		male.setFont(new Font("Tahoma", Font.BOLD,13));
		male.setBounds(125, 139, 70, 25);
		female = new JRadioButton("Female");
		female.setFont(new Font("Tahoma", Font.BOLD,13));
		female.setBounds(200, 139, 80, 25);
		
		// all button setting
		jbexit = new JButton("Exit");
		jbexit.setFont(new Font("Tahoma", Font.BOLD,13));
		jbexit.setBounds(35, 300, 107, 34);
		jbregister = new JButton("Register");
		jbregister.setFont(new Font("Tahoma", Font.BOLD,13));
		jbregister.setBounds(150, 300, 120, 34);
		jbdel = new JButton("Delete");
		jbdel.setFont(new Font("Tahoma", Font.BOLD,13));
		jbdel.setBounds(35, 350, 107, 34);
		jbupdate = new JButton("Update");
		jbupdate.setFont(new Font("Tahoma", Font.BOLD,13));
		jbupdate.setBounds(150, 350, 120, 34);
		
		// reset button setting
		jbreset = new JButton("Reset");
		jbreset.setFont(new Font("Tahoma", Font.BOLD,13));
		jbreset.setBounds(87, 400, 120, 34);
		
		// refresh table button setting
		jbrefresh = new JButton("Refresh Table");
		jbrefresh.setFont(new Font("Tahoma", Font.BOLD,13));
		jbrefresh.setBounds(550, 403, 320, 28);
		
		String column[] = {"S.No","ID","Name","Gender","Address","Contact"};
		
		model = new DefaultTableModel(column,0);
		jt = new JTable(model);
		jt.setBounds(350, 13, 650, 377);
		jt.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 13));
		
		jt.repaint();
		jscroll = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jscroll.setBounds(350, 13, 650, 377);
		
		// frame setting
		frame.setSize(1090, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// radio button group
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		// adding detail in frame	
		frame.add(lregi);
		frame.add(lid);
		frame.add(tf1);
		frame.add(lname);
		frame.add(tf2);
		frame.add(lgen);
		frame.add(male);
		frame.add(female);
		frame.add(ladd);
		frame.add(tf3);
		frame.add(lcont);
		frame.add(tf4);
		frame.add(jbexit);
		frame.add(jbupdate);
		frame.add(jbdel);
		frame.add(jbrefresh);
		frame.add(jbregister);
		frame.add(jbrefresh);
		frame.add(jscroll);
		frame.add(jbreset);
		
		
		jbregister.addActionListener(this);
		jbexit.addActionListener(this);
		jbdel.addActionListener(this);
		jbreset.addActionListener(this);
		jbupdate.addActionListener(this);
		jbrefresh.addActionListener(this);
		
	}
	
	// sql dabase declaration
				String host = "jdbc:mysql://localhost:3306/";
				String dbname = "company";
				String url = host+dbname;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jbregister)
		{
			inserData();
		}
		if(e.getSource() == jbexit)
		{
			 frame.dispose();
		}
		if(e.getSource() == jbdel)
		{
			 deleteData();
		}
		if(e.getSource() == jbreset)
		{
			 tf1.setText(null);
			 tf2.setText(null);
			 female.setSelected(false);
			 male.setSelected(false);
			 tf3.setText(null);
			 tf4.setText(null);
		}
		if(e.getSource() == jbupdate)
		{
			 updateData();
		}
		if(e.getSource() == jbrefresh)
		{
			viewDataInTable();
		}
	}
	
	public void inserData()
	{
		
		try 
		{
			int noofinsert;
			int id = Integer.parseInt(tf1.getText());
			String nam = tf2.getText();
						
			String gend;
			if(male.isSelected())
			{
				gend = male.getText();
			}
			else
				gend = female.getText();
			
			String add = tf3.getText();
			long cont = Long.parseLong(tf4.getText());
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			Statement stmt = con.createStatement();
			String sqlinsert = "insert into registration value(null, '" + id + "','" + nam + "', '" + gend + "','" + add + "','" + cont +"')";
			noofinsert = stmt.executeUpdate(sqlinsert);
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			JOptionPane.showMessageDialog(jbregister, "Registered Successfully");
		}
	}
	public void deleteData()
	{
		int noofdelete;
		int id = Integer.parseInt(tf1.getText());
		String sqldelete = "delete from registration where id='"+id+"'";
				
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			noofdelete = stmt.executeUpdate(sqldelete);
					
		}
		catch (Exception e) 
		{
			System.out.println();
		}
		finally
		{
			JOptionPane.showMessageDialog(jbdel, "Deleted Successfully");
		}
		
	}
	public void updateData()
	{
		int noofupdate;
		int id = Integer.parseInt(tf1.getText());
		String nam = tf2.getText();
					
		String gend="";
		if(male.isSelected())
		{
			gend = male.getText();
		}
		if(female.isSelected())
		{
			gend =female.getText();
		}
		
		String add = tf3.getText();
		long cont = Long.parseLong(tf4.getText());
		String sqlupdate = "update registration set ID= "+id+",Name= '"+nam+"',Gender= '"+gend+"',Address='"+add+"',Contact= "+cont+" where ID='"+id+"'";
								
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			noofupdate = stmt.executeUpdate(sqlupdate);
			JOptionPane.showMessageDialog(jbupdate, "Updated Successfully");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
			
	}
	public void viewDataInTable()
	{
			
		String sqlviewdata = "select * from registration";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlviewdata);



			model.setRowCount(0);
						
			while(rs.next())
			{
				model.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6)});
							
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		new Register();
	}


	}




