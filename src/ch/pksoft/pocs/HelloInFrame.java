package ch.pksoft.pocs;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloInFrame extends JFrame {

	public HelloInFrame() {
		JLabel label = new JLabel("this is my text");
		this.add(label);
		this.setSize(200,  200); 
//		this.pack();	
	}
	
	public static void main(String[] args) {
		HelloInFrame hf = new HelloInFrame(); 
		hf.setVisible(true);
	}
	
}
