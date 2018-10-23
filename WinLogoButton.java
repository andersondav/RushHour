import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 * Sets up the button in the WinScreen that returns the user to the menu
 * @author Anderson
 *
 */
public class WinLogoButton extends JButton{
	
	/**
	 * A constructor that sets up a win button with an image
	 */
	public WinLogoButton(){
		super();
		try {
		    Image img = ImageIO.read(getClass().getResource("meme.png")); 
		    this.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
	}

}
