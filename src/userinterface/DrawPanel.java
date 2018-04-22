package userinterface;


import java.awt.*;
import javax.swing.*;



import java.awt.event.*;


public class DrawPanel extends JPanel{
	private final int WIDTH = 1200, HEIGHT = 850;
	private final int DELAY = 20, IMAGE_SIZE = 47;
	
	private boolean pause;
	
	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;

	
	
	   //Constructor.
	   public DrawPanel()
	   {
		      timer = new Timer(DELAY, new ReboundListener());
		      image = new ImageIcon("small bacon.png");
		      x = 20;
		      y = 40;
		      moveX = moveY = 3;

		      setPreferredSize(new Dimension(WIDTH, HEIGHT));
		      setBackground(Color.black);
		      timer.start();
   
	   }
	   //method to draw the circles on screen
	   public void paintComponent (Graphics page)
	   {
	      super.paintComponent(page);
	      image.paintIcon(this, page, x, y);
	   }
	 
	  public void reset() {
		  x = 20;
	      y = 40;
	      moveX = moveY = 3;
	  }
	   
	   
		
		
		
//class that listens for button to be clicked
//		private class ButtonListener implements ActionListener{
//		      //method that accepts events, in this case "click"
//		      public void actionPerformed (ActionEvent event)
//		      {
//		    	  if (event.getSource() == bStart)
//		    		  reset();
//		    	  //calls method to change the circle colors
//		    	  System.out.println("PRESSY PRESSY");
//		      }
//		      
//	      }
		
		private class ReboundListener implements ActionListener{
		      //--------------------------------------------------------------
		      //  Updates the position of the image and possibly the direction
		      //  of movement whenever the timer fires an action event.
		      //--------------------------------------------------------------
		      public void actionPerformed(ActionEvent event)
		      {
		         x += moveX;
		         y += moveY;
		         
		         
		         if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
		            moveX = moveX * -1;
		         	//needs to add in the sizes of the panels dynamically
		         	//ex:  x <= leftPanel.getWidth() ||  x >= (WIDTH-IMAGE_SIZE)-rightPanel.getWidth()

		         if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
		            moveY = moveY * -1;
		    
		         repaint();
		      }
		}
}
