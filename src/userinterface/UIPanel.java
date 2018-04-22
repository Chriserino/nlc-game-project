package userinterface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class UIPanel extends JPanel{
	private final int WIDTH = 1200, HEIGHT = 900;
	private final int DELAY = 20, IMAGE_SIZE = 47;
	
	
	   
	
	//private Circle circleRed, circleYellow, circleGreen;
	private JButton bMenu;
	private JButton bStart;
	private JPanel buttonPanel;
	private JPanel rightPanel;
	private JPanel leftPanel;
	private DrawPanel dPanel;
	private boolean pause;
	
	//ImageIcon = Test image
	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;

	
	
	   //Constructor
	   public UIPanel()
	   {
//		      timer = new Timer(DELAY, new ReboundListener());
//		      image = new ImageIcon("small bacon.png");
//		      x = 20;
//		      y = 40;
//		      moveX = moveY = 3;

		      setPreferredSize(new Dimension(WIDTH, HEIGHT));
		      setBackground(Color.black);
//		      timer.start();

		   
	      	//create the buttons
			bMenu = new JButton("Menu");
			bMenu.addActionListener(new ButtonListener());
			bMenu.setPreferredSize(new Dimension(100,50));
			
			bStart = new JButton("Restart");
			bStart.addActionListener(new ButtonListener());
			bStart.setPreferredSize(new Dimension(100,50));
			
			
			
			//**make a panel to put the button on
			buttonPanel = new JPanel();
			//set properties
			buttonPanel.setBackground(Color.black);
			buttonPanel.setLayout(new BorderLayout());
			//add button to panel
			buttonPanel.add(bMenu, BorderLayout.EAST);
			buttonPanel.add(bStart, BorderLayout.WEST);
			buttonPanel.setPreferredSize(new Dimension(100,50));

			dPanel = new DrawPanel();
			//set UIpanel layout properties 
			setLayout(new BorderLayout());
			//add button panel to the UIpanel
			//set it's layout orientation
//			add(leftPanel, BorderLayout.WEST);
//			add(rightPanel, BorderLayout.EAST);
			add(dPanel, BorderLayout.NORTH);
			add(buttonPanel, BorderLayout.SOUTH);
	      setPreferredSize (new Dimension(1200, 900));
	      setBackground (Color.blue);

	   }
	   //method to draw the circles on screen
//	   public void paintComponent (Graphics page)
//	   {
//	      super.paintComponent(page);
//	      image.paintIcon(this, page, x, y);
//	   }
	 
//	  public void reset() {
//		   x = 20;
//		      y = 40;
//		      moveX = moveY = 3;
//	  }
	   
	   
		
		
		
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
		
//		private class ReboundListener implements ActionListener{
//		      //--------------------------------------------------------------
//		      //  Updates the position of the image and possibly the direction
//		      //  of movement whenever the timer fires an action event.
//		      //--------------------------------------------------------------
//		      public void actionPerformed(ActionEvent event)
//		      {
//		         x += moveX;
//		         y += moveY;
//		         
//		         
//		         if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
//		            moveX = moveX * -1;
//		         	//needs to add in the sizes of the panels dynamically
//		         	//ex:  x <= leftPanel.getWidth() ||  x >= (WIDTH-IMAGE_SIZE)-rightPanel.getWidth()
//
//		         if (y <= 0 || y >= ((HEIGHT-IMAGE_SIZE) - buttonPanel.getHeight()))
//		            moveY = moveY * -1;
//		    
//		         repaint();
//		      }
//		}

}
