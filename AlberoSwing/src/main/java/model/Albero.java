package model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.Controller;



public class Albero extends JFrame 
{
	   
	private static final long serialVersionUID = 1L;

	   private JButton bottoneLuci;
	   private JButton bottoneRegali;
	   private JButton bottonePalline;
	   private JButton bottoneAll;
	   private JButton bottoneExit;
	 
	   private JPanel titlePanel, imagePanel, buttonPanel, infoPanel;
	 
	   private JLabel title, imageLabel;
	 
	   private ImageIcon image;


	 
	   public Albero(String titolo)
	   {



	      setTitle(titolo);
	      setLayout(new BorderLayout());
	
	      title = new JLabel("DECORATOR");
	      title.setFont(new Font("Christmabet", Font.PLAIN, 60));
	      title.setForeground(Color.ORANGE);
	      title.setHorizontalAlignment(SwingConstants.CENTER);
	 
	      
	      titlePanel = new JPanel();
	      titlePanel.add(title);
	      titlePanel.setBackground(Color.WHITE);
	 
	      
	      imagePanel = new JPanel();
	 
	      image = new ImageIcon(getClass().getResource("/tree.png"));
	 
	      imageLabel = new JLabel(image);
	 
	      imagePanel.add(imageLabel);
	 
	      imagePanel.setBackground(Color.WHITE);
	 
	      buttonPanel = new JPanel();
	      buttonPanel.setBackground(Color.GRAY);
	
	 
	      
	      infoPanel = new JPanel();
	      infoPanel.setBackground(Color.WHITE);
	 
	      
	      bottoneLuci = new JButton("Luci");
	      bottoneRegali = new JButton("Regali");
	      bottonePalline = new JButton("Palline");
	      bottoneAll = new JButton("Tutto");
	      bottoneExit = new JButton("Esci");
	 
		   ActionListener action = new Controller(bottoneAll, bottoneExit, bottoneLuci, bottonePalline, bottoneRegali, this);
		      bottoneLuci.addActionListener(action);
		      bottonePalline.addActionListener(action);
		      bottoneRegali.addActionListener(action);
		      bottoneAll.addActionListener(action);
		      bottoneExit.addActionListener(action);
	      
	      bottoneLuci.setBackground(Color.ORANGE);
	      bottonePalline.setBackground(Color.CYAN);
	      bottoneRegali.setBackground(Color.MAGENTA);
	      bottoneAll.setBackground(Color.YELLOW);
	      bottoneExit.setBackground(Color.RED);
	 
	      
	      bottoneLuci.setFont(new Font("PWJoyeuxNoel", Font.PLAIN, 21));
	      bottonePalline.setFont(new Font("PWJoyeuxNoel", Font.PLAIN, 21));
	      bottoneRegali.setFont(new Font("PWJoyeuxNoel", Font.PLAIN, 21));
	      bottoneAll.setFont(new Font("PWJoyeuxNoel", Font.PLAIN, 21));
	      bottoneExit.setFont(new Font("PWJoyeuxNoel", Font.PLAIN, 21));
	 
	      
	      bottoneLuci.setForeground(Color.BLACK);
	      bottonePalline.setForeground(Color.BLACK);
	      bottoneRegali.setForeground(Color.BLACK);
	      bottoneAll.setForeground(Color.BLACK);
	      bottoneExit.setForeground(Color.BLACK);
	 
	      
	      buttonPanel.add(bottoneLuci);
	      buttonPanel.add(bottonePalline);
	      buttonPanel.add(bottoneRegali);
	      buttonPanel.add(bottoneAll);
	      buttonPanel.add(bottoneExit);
	 
	      

	      
	      add(titlePanel, BorderLayout.NORTH);
	      add(imagePanel, BorderLayout.CENTER);
	      imagePanel.add(infoPanel, BorderLayout.NORTH);
	      add(buttonPanel, BorderLayout.SOUTH);
	 
	      
	      getContentPane().setBackground(Color.WHITE);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setSize(500, 650);
	      setLocation(300,40);
	      setVisible(true);
	 
	   }
	   


	   
	   public void paint(Graphics g)
	   {
	      
	      super.paint(g);
	 
	      if(Controller.luci)
	      {
	         
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
	 
	      else if(Controller.palline)
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
	 
	      else if (Controller.regali)
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
	    else if (Controller.all){
	    	
	        
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
	 
	   

	 
	}