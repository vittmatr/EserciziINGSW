package controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Albero;

public class Controller implements ActionListener{
	
	private JButton allEvent, exit, light, ornaments, presents;
	private Albero albero;
	
	public static boolean regali = false;
	public static boolean palline = false;
	public static boolean luci = false;
	public static boolean all = false;
	 




	   public Controller(JButton allEvent, JButton exit, JButton light, JButton ornaments, JButton presents, Albero albero)
			throws HeadlessException {
		super();
		this.allEvent = allEvent;
		this.exit = exit;
		this.light = light;
		this.ornaments = ornaments;
		this.presents = presents;
		this.albero = albero;
		
	     light.addActionListener(this);
	     ornaments.addActionListener(this);
	     presents.addActionListener(this);
	     allEvent.addActionListener(this);
	     exit.addActionListener(this);


	 
	}


	public void paint(Graphics g)
	   {
	      
	//      albero.paint(g);
	 
	      if(luci)
	      {
	         System.out.println("bott luci");
	         g.setColor(Color.WHITE);
	 
	         
	         g.fillOval(250,190,10,10);
	         g.fillOval(250,260,10,10);
	         g.fillOval(250,350,10,10);
	         g.fillOval(250,430,10,10);
	 
	         
	         g.fillOval(200,260,10,10);
	         g.fillOval(180,350,10,10);
	         g.fillOval(160,430,10,10);
	 
	         
	         g.fillOval(300,260,10,10);
	         g.fillOval(330,350,10,10);
	         g.fillOval(340,430,10,10);
	 
	      }
	 
	      else if(palline)
	      {
	         
	          g.setColor(Color.RED);
	          g.fillOval(220,240,15,15);
	          g.setColor(Color.YELLOW);
	          g.fillOval(280,240,15,15);
	          g.setColor(Color.BLUE);
	          g.fillOval(320,400,15,15);
	          g.setColor(Color.PINK);
	          g.fillOval(180,400,15,15);
	          g.setColor(Color.CYAN);
	          g.fillOval(200,320,15,15);
	          g.setColor(Color.ORANGE);
	          g.fillOval(300,320,15,15);
	          g.setColor(Color.RED);
	          g.fillOval(250,400,15,15);
	          g.setColor(Color.WHITE);
	          g.fillOval(250,320,15,15);	         
	 
	      }
	 
	      else if (regali)
	      {
	        
	         g.setColor(Color.RED);
	         g.fillRect(320,500,60,60);
	         g.fillRect(140,480,30,30);
	 
	         g.setColor(Color.ORANGE);
	         g.fillRect(180,530,40,40);
	 
	         g.setColor(Color.BLUE);
	         g.fillRect(120,500,60,60);
	         g.fillRect(360,540,30,30);
	 
	      }
	    else if (all){
	    	
	        
	        g.setColor(Color.RED);
	        g.fillRect(320,500,60,60);
	        g.fillRect(140,480,30,30);

	        g.setColor(Color.ORANGE);
	        g.fillRect(180,530,40,40);

	        g.setColor(Color.BLUE);
	        g.fillRect(120,500,60,60);
	        g.fillRect(360,540,30,30);
	        
	        
	        g.setColor(Color.RED);
	        g.fillOval(220,220,15,15);
	        g.fillOval(280,220,15,15);
	        g.setColor(Color.BLUE);
	        g.fillOval(320,380,15,15);
	        g.fillOval(180,380,15,15);
	        g.setColor(Color.CYAN);
	        g.fillOval(200,300,15,15);
	        g.fillOval(300,300,15,15);
	        
	        
	        g.setColor(Color.WHITE);

	        
	        g.fillOval(250,190,10,10);
	        g.fillOval(250,260,10,10);
	        g.fillOval(250,350,10,10);
	        g.fillOval(250,430,10,10);

	        
	        g.fillOval(200,260,10,10);
	        g.fillOval(180,350,10,10);
	        g.fillOval(160,430,10,10);

	        
	        g.fillOval(300,260,10,10);
	        g.fillOval(330,350,10,10);
	        g.fillOval(340,430,10,10);
	    	
	    }
	 
	   } 
	 

	public void actionPerformed(ActionEvent event) {
		 if(event.getSource()==light)
	      {
	         palline = false;
	         regali = false;
	         luci = true;
	         albero.repaint();
	 
	      }
	 
	      else if(event.getSource()==ornaments)
	      {
	         luci = false;
	         regali = false;
	         palline = true;
	         albero.repaint();
	 
	      }
	 
	      else if(event.getSource()==presents)
	      {
	         luci = false;
	         palline = false;
	         regali = true;
	         albero.repaint();
	 
	      }
	 
	      else if(event.getSource()==allEvent)
	      {
	         all=true;
	         luci = false;
	         palline = false;
	         regali = false;
	         albero.repaint();
	      }
	 
	      else
	      {
	         System.exit(0);
	 
	      }
	 
		
	}
	


}
