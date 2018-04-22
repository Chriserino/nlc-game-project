package userinterface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class UIPanel extends JPanel{
	private final int WIDTH = 1200, HEIGHT = 900;
	private final int DELAY = 20, IMAGE_SIZE = 47;
	
	private JButton bMenu;
	private JButton bStart;
	private JPanel buttonPanel;
	private boolean pause;
	
	//ImageIcon = Test image
	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;

	
	
	   //Constructor
	   public UIPanel()
	   {
		      setPreferredSize(new Dimension(WIDTH, HEIGHT));
		      setBackground(Color.black);


		   
	      	//create the buttons
			bMenu = new JButton("Menu");
			bMenu.addActionListener(new ButtonListener());
			bMenu.setPreferredSize(new Dimension(100,50));
			
			bStart = new JButton("Restart");
			bStart.addActionListener(new ButtonListener());
			bStart.setPreferredSize(new Dimension(100,50));
			
			
			
			//**make a panel to put the button on**
			buttonPanel = new JPanel();
			//set properties
			buttonPanel.setBackground(Color.black);
			buttonPanel.setLayout(new BorderLayout());
			//add button to panel
			buttonPanel.add(bMenu, BorderLayout.EAST);
			buttonPanel.add(bStart, BorderLayout.WEST);
			buttonPanel.setPreferredSize(new Dimension(100,50));

			//Create DrawPanel
			dPanel = new DrawPanel();
			
			//set UIpanel layout properties and add button / Draw panels
			setLayout(new BorderLayout());
			add(dPanel, BorderLayout.NORTH);
			add(buttonPanel, BorderLayout.SOUTH);
	      setPreferredSize (new Dimension(1200, 900));
	      setBackground (Color.blue);

	   }
	   		
	   //class that listens for button to be clicked
		private class ButtonListener implements ActionListener{
		      //method that accepts events, in this case "click"
		      public void actionPerformed (ActionEvent event)
		      {
		    	  if (event.getSource() == bStart)
		    		  dPanel.reset();
		    	  
		    	  if (event.getSource() == bMenu)
		    		  System.out.println("PRESSY PRESSY");
		      }
		      
	      }
		


}
