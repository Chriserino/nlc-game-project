package userinterface;

import javax.swing.JFrame;

public class UIDriver {
	public static void main(String[] args) {
		//create JFrame object
		JFrame frame = new JFrame ("Traffic Light");
	      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	      
	      //add UIPanel to frame
	      frame.getContentPane().add(new UIPanel());
	      //Set Resizable true / false
	      frame.setResizable(true);
	      frame.pack();
	      frame.setVisible(true);


	}
}
