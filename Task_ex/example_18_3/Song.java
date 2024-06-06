package example_18_3;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import java.applet.AudioClip;


public class Song {
	
		JFrame frame;
		JButton b1, b2, b3, b4, b5;
		JLabel l1;
		
		String[] choics = { "cartoon.wav","grit.wav","lost.wav","win.wav","x.wav" }; 
		URL file1 = getClass().getResource(choics[0]); 
		URL file2 = getClass().getResource(choics[1]);
		URL file3 = getClass().getResource(choics[2]);
		URL file4 = getClass().getResource(choics[3]);
		URL file5 = getClass().getResource(choics[4]);
		AudioClip sounda = java.applet.Applet.newAudioClip(file1);
		AudioClip soundb = java.applet.Applet.newAudioClip(file2);
		AudioClip soundc = java.applet.Applet.newAudioClip(file3);
		AudioClip soundd = java.applet.Applet.newAudioClip(file4);
		AudioClip sounde = java.applet.Applet.newAudioClip(file5);
		
		public void Play1()
		{
			sounda.play();
		}
		
		public void Play2()
		{
			soundb.play();
		}
		
		public void Play3()
		{
			soundc.play();
		}
		
		public void Play4()
		{
			soundd.play();
		}
		
		public void Play5()
		{
			sounde.play();
		}
		
		public Song() 
		{
			// TODO Auto-generated constructor stub
			frame = new JFrame();
			l1 = new JLabel("Playlist - ");
			l1.setBounds(277, 25, 200, 14);
			b1 = new JButton("Song 1");
			b1.setBounds(22, 100, 89, 23);
			b2 = new JButton("Song 2");
			b2.setBounds(142, 100, 89, 23);
			b3 = new JButton("Song 3");
			b3.setBounds(264, 100, 89, 23);
			b4 = new JButton("Song 4");
			b4.setBounds(388, 100, 89, 23);
			b5 = new JButton("Song 5");
			b5.setBounds(517, 100, 89, 23);
			
			
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Play1();
					soundb.stop();
					soundc.stop();
					soundd.stop();
					sounde.stop();
				}
			});
			
			b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Play2();
					sounda.stop();
					soundc.stop();
					soundd.stop();
					sounde.stop();
				}
			});
			
			b3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Play3();
					sounda.stop();
					soundb.stop();
					soundd.stop();
					sounde.stop();
				}
			});
			
			b4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Play4();
					sounda.stop();
					soundb.stop();
					soundc.stop();
					sounde.stop();
				}
			});
			
			b5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Play5();
					sounda.stop();
					soundb.stop();
					soundc.stop();
					soundd.stop();
				}
			});
			
			frame.add(l1);
			frame.add(b1);
			frame.add(b2);
			frame.add(b3);
			frame.add(b4);
			frame.add(b5);
			frame.setSize(586, 190);
			frame.setLayout(new FlowLayout());
			frame.setVisible(true);
		
		}
		
		public static void main(String[] args) 
		{
			new Song();
		}

		
}
	

	
		
