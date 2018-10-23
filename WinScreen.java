import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Sets up the screen the user sees when they win the game
 * @author Anderson
 *
 */
public class WinScreen {

	/**
	 * A JFrame representing the screen displayed when a player wins
	 */
	private JFrame win;
	
	/**
	 * A JButton that indicates the player has won with a picture/meme
	 * and returns them to the start screen
	 */
	private WinLogoButton meme;
	
	/**
	 * Constructor that sets up the WinScreen with a JFrame and JButton
	 */
	public WinScreen(){
		win = new JFrame();
		win.setSize(1300, 1000);
		win.setVisible(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		meme = new WinLogoButton();
		meme.setBounds(500,500,300,300);
		win.add(meme);
		win.repaint();
	}
	
	/**
	 * Sets the win screen to be visible or not
	 * @param a true means screen is visible, false means screen is not visible
	 */
	public void setVisible(boolean a){
		this.win.setVisible(a);
	}
	
	/**
	 * A getter for the win button
	 * @return The WinButton
	 */
	public JButton winbutton(){
		return this.meme;
	}
	
	
}
