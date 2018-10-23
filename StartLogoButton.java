import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StartLogoButton extends JButton{

	
	public StartLogoButton(){
		super();
		  try {
		    Image img = ImageIO.read(getClass().getResource("RushHourLogo.jpg")); 
		    this.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
	}
	
	
	
	
	
	
	
	
}
