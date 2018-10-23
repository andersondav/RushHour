import java.util.Arrays;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Board extends InternetJButtonColor{

	private JFrame level;
	private JFrame easygame;
	private JFrame mediumgame;
	private JFrame hardgame;
	private JFrame startscreen;
	private JButton RushHour;
	private JButton easy;
	private JButton medium;
	private JButton hard;
	
	public Board(){
		level=new JFrame();
		level.setSize(1300,1000);
		level.setLayout(null);
		//level.setBackground(arg0);
		//level.setState(JFrame.NORMAL);
		level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		level.setVisible(false);	
		
		easygame=new JFrame();
		easygame.setSize(1300,1000);
		easygame.setLayout(null);
		//level.setBackground(arg0);
		//level.setState(JFrame.NORMAL);
		easygame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		easygame.setVisible(false);	
		
		mediumgame=new JFrame();
		mediumgame.setSize(1300,1000);
		mediumgame.setLayout(null);
		//level.setBackground(arg0);
		//level.setState(JFrame.NORMAL);
		mediumgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mediumgame.setVisible(false);	
		
		hardgame=new JFrame();
		hardgame.setSize(1300,1000);
		hardgame.setLayout(null);
		//level.setBackground(arg0);
		//level.setState(JFrame.NORMAL);
		hardgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hardgame.setVisible(false);	
		
		startscreen = new JFrame();
		startscreen.setSize(1300, 1000);
		startscreen.setLayout(null);
		startscreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startscreen.setVisible(true);
		
		easy = new JButton("EASY");
		easy.setBounds(150,500,300,200);
		easy.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						startscreen.setVisible(false);
						level.setVisible(false);
						easygame.setVisible(true);
						
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
		startscreen.add(easy);
		easy.setOpaque(true);
		easy.setBackground(Color.GREEN);
		
		medium = new JButton("MEDIUM");
		medium.setBounds(520,500,300,200);
		medium.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						startscreen.setVisible(false);
						//level.setVisible(true);
						mediumgame.setVisible(true);
						
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
		startscreen.add(medium);
		medium.setOpaque(true);
		medium.setBackground(Color.YELLOW);
		
		hard = new JButton("HARD");
		hard.setBounds(890,500,300,200);
		hard.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						startscreen.setVisible(false);
						//level.setVisible(true);
						hardgame.setVisible(true);
						
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
		startscreen.add(hard);
		hard.setOpaque(true);
		hard.setBackground(Color.RED);
		
		returntomenu();
		
		JButton rushhour = new JButton("RUSH HOUR: A PUZZLE GAME");
		rushhour.setBounds(520,150, 300,100);
		rushhour.setOpaque(true);
		rushhour.setBackground(Color.CYAN);
		startscreen.add(rushhour);
		
		
		//failed to add an image :(
		/*
		 JButton button = new JButton();
		  try {
		    Image img = ImageIO.read(getClass().getResource("images\\rushhour2.png"));
		    button.setIcon(new ImageIcon(img));
		  } catch (IOException ex) {
		    System.out.println(ex);
		  }
		//image.setBounds(520, 250, 200,200);
		  button.setBounds(100,100,100,100);
		startscreen.add(button);
		*/
		
		
	}
	
	public void returntomenu(){
		JButton easyreturn = new JButton("Return to Menu");
		easyreturn.setBounds(1050, 600, 150, 100);
		easyreturn.setOpaque(true);
		easyreturn.setBackground(Color.BLACK);
		easygame.add(easyreturn);
		easyreturn.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						startscreen.setVisible(true);
						//I need to figure out how to reset the board
						easygame.setVisible(false);
						
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
		
		JButton mediumreturn = new JButton("Return to Menu");
		mediumreturn.setBounds(1050, 600, 150, 100);
		mediumreturn.setOpaque(true);
		mediumreturn.setBackground(Color.BLACK);
		mediumgame.add(mediumreturn);
		mediumreturn.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						startscreen.setVisible(true);
						//level.setVisible(true);
						mediumgame.setVisible(false);
						
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
		
		JButton hardreturn = new JButton("Return to Menu");
		hardreturn.setBounds(1050, 600, 150, 100);
		hardreturn.setOpaque(true);
		hardreturn.setBackground(Color.BLACK);
		hardgame.add(hardreturn);
		hardreturn.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						startscreen.setVisible(true);
						//level.setVisible(true);
						hardgame.setVisible(false);
						
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
		
	}
	
	public void addButton(JButton b){
		level.add(b);
	}
	
	public void addeasyButton(JButton b){
		easygame.add(b);
	}
	
	public void addmediumButton(JButton b){
		mediumgame.add(b);
	}
	
	public void addhardButton(JButton b){
		hardgame.add(b);
	}

	public JFrame getLevel(){
		return level;
	}
	
	public void createBackground(Board board){
		
		for(int side1=0;side1<=5;side1++){
			for(int side2=0;side2<=5;side2++){		
				MyButton b=new MyButton("");
				MyButton c=new MyButton("");
				MyButton d=new MyButton("");
				MyButton e=new MyButton("");
				
				setColorWheel(b);
				setColorWheel(c);
				setColorWheel(d);
				setColorWheel(e);

				b.setBounds(150*side1, 150*side2, 150, 150);
				c.setBounds(150*side1, 150*side2, 150, 150);
				d.setBounds(150*side1, 150*side2, 150, 150);
				e.setBounds(150*side1, 150*side2, 150, 150);

				b.setBorder(BorderFactory.createLoweredBevelBorder());
				c.setBorder(BorderFactory.createLoweredBevelBorder());
				d.setBorder(BorderFactory.createLoweredBevelBorder());
				e.setBorder(BorderFactory.createLoweredBevelBorder());

				b.setBackground(Color.lightGray);
				c.setBackground(Color.lightGray);
				d.setBackground(Color.lightGray);
				e.setBackground(Color.lightGray);

				board.addButton(b);
				board.addeasyButton(c);
				board.addmediumButton(d);
				board.addhardButton(e);
			}
		}
	}
	
	
}
