import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Class that makes StartScreens for the game
 * @author Anderson
 *
 */
public class StartScreen {
	
	/**
	 * A JFrame representing the start screen
	 */
	private JFrame startscreen;
	
	/**
	 * A JButton representing the Play Now button
	 */
	private JButton PlayNow;
	
	/**
	 * JButton with image of title of game
	 */
	private StartLogoButton start;
	
	/**
	 * Sets up the start screen with the Play Now button
	 */
	public StartScreen(){
		startscreen = new JFrame();
		startscreen.setSize(1300, 1000);
		startscreen.setLayout(null);
		startscreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PlayNow = new JButton("PLAY NOW");
		PlayNow.setBounds(510,500,300,50);
		
		startscreen.add(PlayNow);
		
		start = new StartLogoButton();
		start.setBounds(480,140, 362, 210);
		startscreen.add(start);
		
		startscreen.setVisible(true);

	}
	
	/**
	 * Setter for visibility of the JFrame of the start screen
	 * @param a If a is set to false, JFrame will be set to not visible. If a is set to true, 
	 * JFrame will be set to visible
	 */
	public void setstartvisibility(boolean a){
		startscreen.setVisible(a);
	}
	
	/**
	 * Getter for the Play Now button
	 * @return A JButton for the Play Now button
	 */
	public JButton getPlayNow(){
		return this.PlayNow;
	}
	
	/**
	 * Getter for the start screen
	 * @return A JFrame for the start screen
	 */
	public JFrame getstartscreen(){
		return this.startscreen;
	}
	 
	
	
	
	
	

}
