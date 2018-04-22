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

	
	
	   //Constructor
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
	  
	   public void paintComponent (Graphics page)
	   {
	      super.paintComponent(page);
	      image.paintIcon(this, page, x, y);
	   }
	 
	   
	  //Use this method to reset everything
	  public void reset() {
		  x = 20;
	      y = 40;
	      moveX = moveY = 3;
	  }
	   
	   
		
		
		

		
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
		         	
		         if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
		            moveY = moveY * -1;
		    
		         repaint();
		      }
		}
}
