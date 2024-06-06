package example_22_3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Random {
	
	JFrame frame;
	JButton b1;
	JTextField tf1;
	static int number;
	String num;
	int i, k = 5;
	
	public  Random()
	{
		frame = new JFrame();
		b1 = new JButton("ok");
		b1.setBounds(120,165,80,30);
		tf1 = new JTextField();
		tf1.setBounds(100,100,150,40);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 num = tf1.getText().toString();
				 int num2 = Integer.parseInt(num);
			
			
				 for (i = 0; i <k; i++) {
					 
			            //.out.println(
			              //  "Guess the number:");
			 
			            // Take input for guessing
			            //guess = sc.nextInt();
			 
			            // If the number is guessed
			            if (number == num2) {
			                System.out.println(
			                    "Congratulations!"
			                    + " You guessed the number.");
			                break;
			            }
			            else if (number > num2
			                     && i != k- 1) {
			                System.out.println(
			                    "The number is "
			                    + "greater than " + num2);
			                
			                break;
			            }
			            else if (number < num2
			                     && i != k- 1) {
			                System.out.println(
			                    "The number is"
			                    + " less than " + num2);
			            break;
			            }
			            
			            if (i == k) {
				            System.out.println(
				                "You have exhausted"
				                + k+" trials.");
				 
//				            System.out.println(
//				                "The number was " + number);
				      
				            
				        }
			        }
			 
			       
			    }
			
			
		});
		
		frame.add(b1);
		frame.add(tf1);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Random();
		 number = 1+(int)(20*Math.random());
		System.out.println(number);
	}

}
