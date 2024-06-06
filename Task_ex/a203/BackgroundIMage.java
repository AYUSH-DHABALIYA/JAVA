package com.a203;

import java.awt.*;  
import javax.swing.JFrame;  
  
public class BackgroundIMage extends Canvas{ 
	
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("D://jane.jpg");  
        g.drawImage(i, 0, 0, 1300, 650, this);
        
          
    }  
        public static void main(String[] args) {  
        BackgroundIMage m=new BackgroundIMage();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(800,650);  
        f.setVisible(true);  
    }  
  
}  